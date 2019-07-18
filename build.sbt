name := "scala-tutorial"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.3" % "runtime"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.3" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.4.3" % "provided"
