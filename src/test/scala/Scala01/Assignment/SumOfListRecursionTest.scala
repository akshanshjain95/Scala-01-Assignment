package Scala01.Assignment

import org.scalatest.FunSuite

class SumOfListRecursionTest extends FunSuite {

  val recursionSum = new SumOfListRecursion

  test("Passing list with 5 elements")
  {
    assert(recursionSum.sumUsingRecursion(List(1,2,3,4,5), 5) === 15)
  }

  test("Passing list with one element")
  {
    assert(recursionSum.sumUsingRecursion(List(4), 1) === 4)
  }

  test("Passing empty list")
  {
    assert(recursionSum.sumUsingRecursion(List(), 0) === 0)
  }
}
