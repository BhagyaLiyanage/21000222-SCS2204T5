package LabSheet_05
import scala.io.StdIn

object Q3 {
  def main(args: Array[String]): Unit = {
    println("Enter the value of n : ")
    val n = StdIn.readInt()
    println("Addition of all numbers from 1 to "+n +" : " + sum(n));

  }
  def sum(n: Int): Int = {
    if (n <= 0) {
      0
    } else {
      n + sum(n - 1)
    }
  }
}
