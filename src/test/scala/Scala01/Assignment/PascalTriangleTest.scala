package Scala01.Assignment

import org.scalatest.FunSuite

class PascalTriangleTest extends FunSuite {

  val pascalTriObject = new PascalTriangle

  test("Testing when column samller than row")
  {
    assert(pascalTriObject.pascalElem(1,2) === 2)
  }

  test("Testing when column greater than row")
  {
    assert(pascalTriObject.pascalElem(2,1) === 0)
  }

  test("Testing with negative positions")
  {
    intercept[IllegalArgumentException]{
      pascalTriObject.pascalElem(-1,-4)
    }
  }
}