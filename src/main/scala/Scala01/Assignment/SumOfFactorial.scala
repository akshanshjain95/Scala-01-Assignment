package Scala01.Assignment


class SumOfFactorial {

  def factorial(num:Int):Int = {
    require(num >= 0)
    if(num==0) 1 else if(num==1) num else num*factorial(num-1)
  }

  def sumOfDigits(numsum:Int):Int = {
    if(numsum == 0) 0 else numsum%10 + sumOfDigits(numsum/10)
  }

}
