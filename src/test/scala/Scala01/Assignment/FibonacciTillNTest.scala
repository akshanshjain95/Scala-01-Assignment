package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/7/17.
  */
class FibonacciTillNTest extends FunSuite {

  val fibo = new FibonacciTillN

  test("Testing for positive position greater than 0")
  {
    assert(fibo.fiboList(5) === List(0,1,1,2,3))
  }

  test("Testing with position as 0")
  {
    intercept[IllegalArgumentException]
    {
      fibo.fiboList(0)
    }
  }
}
