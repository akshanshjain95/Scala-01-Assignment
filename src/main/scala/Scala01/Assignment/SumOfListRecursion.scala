package Scala01.Assignment

class SumOfListRecursion {

  def sumUsingRecursion(list: List[Int], length:Int):Int = {
    if(length == 0) 0 else list(length-1) + sumUsingRecursion(list, length-1)
  }

}
