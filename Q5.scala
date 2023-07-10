package LabSheet_05
import scala.io.StdIn

object Q5{
    def main(args: Array[String]): Unit = {
      println("Enter the value of n : ")
      val n = StdIn.readInt()
      println("Addition of all even numbers : " +sumEven(n));
    }

    def sumEven(n: Int): Int = {
       if (n <= 0) {
          0
       } else if (n % 2 == 0) {
          n + sumEven(n - 2)
       } else {
          sumEven(n - 1)
       }
    }
}

