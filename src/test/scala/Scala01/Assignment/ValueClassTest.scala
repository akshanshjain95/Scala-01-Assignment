package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class ValueClassTest extends FunSuite {

  val fn = new FirstName("Akshansh")
  val ln = new LastName("Jain")
  val age = new Age(21)
  val obj = new ValueClass
  obj.display(fn,ln,age)

  test("Testing Value Class")
  {
    assert(obj.display(fn,ln,age) === "Akshansh Jain is of 21 years")
  }
}
