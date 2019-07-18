package com.demo.spark

import org.apache.spark.sql.types.{IntegerType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

object Spark2x {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("Spark Demo").master("local").getOrCreate()

    val csvRDD = spark.sparkContext.textFile("C:\\GitWorkspace\\scala-tutorial\\input\\sampleSubmission.csv")
    println(csvRDD.count())

    csvRDD.take(3).foreach(println)

    val header = csvRDD.first()

    val csvRDDWithoutHeader = csvRDD.filter(_ != header) //csvRDD.filter(line => line != header)

    csvRDDWithoutHeader.take(3).foreach(println)

    val phraseId = csvRDDWithoutHeader.map(line => line.split(",")(0))
    phraseId.take(10).foreach(println)

    phraseId.saveAsTextFile("output/phraseId")

    //Creating a Dataframe in Spark2x
    val rdd = spark.sparkContext.parallelize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))

    val schema = StructType(
      StructField("Numbers", IntegerType, false) :: Nil
    )

    val rowRDD = rdd.map(line => Row(line))

    val df = spark.createDataFrame(rowRDD, schema)

    df.printSchema()

    df.show()


  }

}
