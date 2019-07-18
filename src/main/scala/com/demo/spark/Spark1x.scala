package com.demo.spark

import org.apache.spark.sql.types.{IntegerType, StructField, StructType}
import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

object Spark1x {

  def main(args: Array[String]): Unit = {

    val intArray = Array(1, 2, 3, 4, 5)

    val sparkConf = new SparkConf().setAppName("Demo App").setMaster("local")

    val sc = new SparkContext(sparkConf)

    val intRDD = sc.parallelize(intArray);

    intRDD.collect().foreach(println)

    println(intRDD.count())

    val fileRDD = sc.textFile("C:\\GitWorkspace\\scala-tutorial\\input\\sampleSubmission.csv")

    println("Num of rows --->" + fileRDD.count())

    println(fileRDD.first())

    //Creating DataSet in Spark1.x
    val sqlContext = new SQLContext(sc)

    val rdd = sc.parallelize(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0))

    val schema = StructType(
      StructField("Numbers", IntegerType, false) :: Nil
    )

    val rowRDD = rdd.map(line => Row(line))

    val df = sqlContext.createDataFrame(rowRDD, schema)

    df.printSchema()

    df.show() //default 20 rows

  }

}
