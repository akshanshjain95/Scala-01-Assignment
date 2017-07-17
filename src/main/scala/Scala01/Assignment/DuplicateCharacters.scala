package Scala01.Assignment

class DuplicateCharacters {

  def stringFilter(str: String):String = {
    val initialString = ""
    def innerStringFilter(str: String, initialString: String,len:Int):String = {
      if(len==1||len==0) {
        initialString
      }
      else if(str(len-1) == str(len-2))
      {
        val str2 = initialString + str(len-1) + str(len-2)
        innerStringFilter(str,str2,len-2)
      }
      else
      {
        innerStringFilter(str,initialString,len-1)
      }
    }
    innerStringFilter(str,initialString,str.length).reverse
  }

}
