package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class sumUsingHigherOrderTest extends FunSuite {

  val sumObj = new sumUsingHigherOrder

  test("Testing sum of squares with positive numbers")
  {
    assert(sumObj.sum((a:Int, b:Int)=>a*a + b*b, 5,4) === 41)
  }

  test("Testing sum of squares with negative numbers")
  {
    assert(sumObj.sum((a:Int, b:Int)=>a*a + b*b, -5,-4) === 41)
  }

  test("Testing sum of cubes with positive numbers")
  {
    assert(sumObj.sum((a:Int, b:Int)=>a*a*a + b*b*b, 5,4) === 189)
  }

  test("Testing sum of cubes with negative numbers")
  {
    assert(sumObj.sum((a:Int, b:Int)=>a*a*a + b*b*b, -5,-4) === -189)
  }

  test("Testing sum of ints with positive numbers")
  {
    assert(sumObj.sum((a:Int, b:Int)=>a + b, 5,4) === 9)
  }

  test("Testing sum of ints with negative numbers")
  {
    assert(sumObj.sum((a:Int, b:Int)=>a + b, -5,-4) === -9)
  }
}
