package Scala01.Assignment

import org.scalatest.FunSuite

class SumListTest extends FunSuite {

  val list1 = List(1,2,3,4,5)
  val list2 = List(10,20,30,40,50)
  val sum = new SumList

  test("Passing lists")
  {
    assert(sum.sumList(list1, list2) === List(11,22,33,44,55))
  }

  test("Passing empty lists")
  {
    assert(sum.sumList(List(), List()) === List())
  }
}
