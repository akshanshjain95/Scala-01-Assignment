package Scala01.Assignment

import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class queueTest extends FunSuite {

  val obj = new DoubleQueue(List(1,2,3,4,5,6,7,8))
  val obj2 = new SquareQueue(List(1,2,3,4,5,6,7,8,9))

  test("Testing DoubleQueue enqueue")
  {
    val obj1 = obj.enqueue(9)
    assert(obj1.toString === List(1,2,3,4,5,6,7,8,18).toString)
  }

  test("Testing DoubleQueue dequeue")
  {
    val obj1 = obj.dequeue
    assert(obj1.toString === List(2,3,4,5,6,7,8).toString)
  }

  test("Testing SquareQueue enqueue")
  {
    val obj1 = obj2.enqueue(10)
    assert(obj1.toString === List(1,2,3,4,5,6,7,8,9,100).toString)
  }

  test("Testing SquareQueue dequeue")
  {
    val obj1 = obj2.dequeue
    assert(obj1.toString === List(2,3,4,5,6,7,8,9).toString)
  }

}
