package Scala01.Assignment

/**
  * Created by knoldus on 16/7/17.
  */
class PascalTriangle {

  def pascalElem(c:Int, r:Int):Int = {

    require(c>=0 && r>=0)

    if (c == r || c == 0) {
      1
    }
    else if (c > r) {
      0
    }
    else {
      pascalElem(c - 1, r - 1) + pascalElem(c, r - 1)
    }
  }

}