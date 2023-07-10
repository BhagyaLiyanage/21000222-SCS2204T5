package LabSheet_05

object Q4 {
  def main(args: Array[String]): Unit = {
    val result = isEven(15);
    if(result==true){
      println("Even number");
    }else{
      println("Odd number");
    }
  }

  def isEven(n: Int): Boolean = {
    if (n == 0) {
      true
    } else if (n == 1) {
      false
    } else if (n < 0) {
      isEven(-n)
    } else {
      isEven(n - 2)
    }
  }
}
