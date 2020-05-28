package lab

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object main_lab
{
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("main_lab").setMaster("local[*]")
    val sc = new SparkContext(conf);
    val spark = SparkSession.builder.appName("Test app").getOrCreate()
    val datafile = spark.read
      .format("com.databricks.spark.csv")
      .option("header",true)
      .load("c:/Projects/school/Java/Lab10/netflix_titles.csv")
    //datafile.show()
    datafile.createOrReplaceTempView("netflix")

    spark.sql("SELECT title, type, rating, release_year FROM netflix WHERE release_year = 2018 OR release_year = 2019 ").show()
    spark.sql("SELECT director, COUNT(show_id) FROM netflix GROUP BY director ORDER BY director").show()

    spark.stop()
  }
}