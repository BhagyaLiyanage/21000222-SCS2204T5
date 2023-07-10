package LabSheet_05

object Q1 {
   def main(args: Array[String]): Unit = {
      println(prime(8));
   }

  def prime(n: Int, i: Int = 2): Boolean = {
    if (n <= 2) {
      if (n == 2) true
      else false
    } else if (n % i == 0) {
      false
    } else if (i * i > n) {
      true
    } else {
      prime(n, i + 1)
    }
  }
}
