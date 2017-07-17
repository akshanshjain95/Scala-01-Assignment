package Scala01.Assignment

/**
  * Created by knoldus on 17/7/17.
  */
class sumUsingHigherOrder {

    def sum(f:(Int,Int)=>Int, a:Int, b:Int):Int = {
      f(a,b)
    }
}
