package Scala01.Assignment

/**
  * Created by knoldus on 16/7/17.
  */
class SumList {

  def sumList(x: List[Int], y: List[Int]): List[Int] = x.zip(y).map(t => t._1 + t._2)
}
