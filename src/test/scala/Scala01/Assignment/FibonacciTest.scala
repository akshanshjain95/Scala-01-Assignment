package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/7/17.
  */
class FibonacciTest extends FunSuite {

  val fibo = new Fibonacci

  test("Testing for positive position")
  {
    assert(fibo.computeFibonacci(6) === 8)
  }

  test("Testing for negative position")
  {
    intercept[IllegalArgumentException] {
      fibo.computeFibonacci(-3)
    }
  }
}
