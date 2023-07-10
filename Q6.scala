package LabSheet_05

object Q6 {
  def main(args: Array[String]): Unit = {
    printFibonacci(15)
  }

  def printFibonacci(n: Int): Unit = {
    def fibonacciHelper(n: Int): Int = {
      if (n <= 1)
        n
      else
        fibonacciHelper(n - 1) + fibonacciHelper(n - 2)
    }

    for (i <- 0 until n) {
      print(fibonacciHelper(i) + " ")
    }
  }
}
