package Scala01.Assignment

import org.scalatest.FunSuite


class SumOfFactorialTest extends FunSuite {

  val sumOfFact = new SumOfFactorial

  test("Testing factorial of 5")
  {
    assert(sumOfFact.factorial(5) === 120)
  }

  test("Testing factorial of 0")
  {
    assert(sumOfFact.factorial(0) === 1)
  }

  test("Testing factorial of negative number")
  {
    intercept[IllegalArgumentException] {
      sumOfFact.factorial(-3)
    }
  }

  test("Testing sumOfDigits")
  {
    assert(sumOfFact.sumOfDigits(50483) === 20)
  }
}
