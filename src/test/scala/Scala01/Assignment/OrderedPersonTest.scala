package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class OrderedPersonTest extends FunSuite {

  val Person1 = new OrderedPerson("Akshansh", 20)
  val Person2 = new OrderedPerson("Aman", 20)
  val Person3 = new OrderedPerson("Akshansh", 21)
  val Person4 = new OrderedPerson("Akshansh", 20)

  test("Comparing persons with different names")
  {
    assert((Person1 < Person2) === false)
  }

  test("Comapring persons with same names but different ages")
  {
    assert((Person1 < Person3) === true)
  }

  test("Comparing persons with same names and same ages")
  {
    assert((Person1 < Person4) === false)
  }
}
