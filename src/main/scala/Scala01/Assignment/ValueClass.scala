package Scala01.Assignment

/**
  * Created by knoldus on 17/7/17.
  */
class ValueClass {

  def display(f:FirstName, l:LastName, age:Age): String = {
    s"${f.fname} ${l.lname} is of ${age.age} years"
  }

}

class FirstName(val fname:String) extends AnyVal
class LastName(val lname:String) extends AnyVal
class Age(val age:Int) extends AnyVal
