package Scala01.Assignment

/**
  * Created by knoldus on 16/7/17.
  */
class OrderedPerson(val name:String, val age:Int) extends Ordered[OrderedPerson] {

  override def compare(that: OrderedPerson): Int = {
    if(name.equals(that.name))
    {
      age - that.age
    }
    else{
      name.length - that.name.length
    }

}
}