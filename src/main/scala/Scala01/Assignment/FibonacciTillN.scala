package Scala01.Assignment

/**
  * Created by knoldus on 15/7/17.
  */
class FibonacciTillN {

  def fiboList(n: Int): List[Int] = {

    require(n>0)

    val l = List(1,0)

    def compute(a: Int, b: Int, l: List[Int], n: Int, z: Int): List[Int] = {
      if (z > n - 3) {
        l
      }
      else {
        val f = a + b
        val l1 = f :: l
        compute(b, f, l1, n, z + 1)
      }
    }

    if (n == 1) List(0) else compute(0, 1, l, n, 0).reverse
  }

}
