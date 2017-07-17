package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/7/17.
  */
class AreaTest extends FunSuite {

  val areaObject = new Area

  test("Testing area of rectangle")
  {
    assert(areaObject.areaOfShape("rectangle", 5, 5, (a: Int, b: Int) => a * b) === "Area of rectangle is 25")
  }

  test("Testing area of rhombus")
  {
    assert(areaObject.areaOfShape("rhombus", 6, 5, (a: Int, b: Int) => a * b/2) === "Area of rhombus is 15")
  }

  test("Testing area of parallelogram")
  {
    assert(areaObject.areaOfShape("parallelogram", 5, 5, (a: Int, b: Int) => a * b) === "Area of parallelogram is 25")
  }

  test("Testing area with 0 as input")
  {
    intercept[IllegalArgumentException] {
      areaObject.areaOfShape("rectangle", 0, 0, (a: Int, b: Int) => a * b)
    }
  }

  test("Testing area of undefined shape")
  {
    assert(areaObject.areaOfShape("Triangle", 5, 5, (a: Int, b: Int) => a * b/2) === "Triangle is not a valid shape")
  }
}
