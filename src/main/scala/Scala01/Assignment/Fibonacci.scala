package Scala01.Assignment

/**
  * Created by knoldus on 15/7/17.
  */
class Fibonacci {

  def computeFibonacci(n:Int):Int = {
    require(n>=0)
    if(n==0 || n==1) n else computeFibonacci(n-1) + computeFibonacci(n-2)
  }

}
