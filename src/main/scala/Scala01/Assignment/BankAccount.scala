package Scala01.Assignment

object PanConversion {
  implicit def panToID(x: String): Int = {
    val sum=0
    def retID(x:String, sum: Int,len:Int):Int = {
      if(len==0) {
        sum
      }
      else
      {
        if(x(len-1).isDigit)
        {
          val sum1 = sum + x(len-1).asDigit
          retID(x, sum1, len-1)
        }
        else
        {
          val sum1 = sum + x(len-1)
          retID(x, sum1, len-1)
        }
      }
    }
    retID(x, sum, x.length)
  }
}

object BankAccount{

  def name():String = "State Bank of Knoldus"

  def number():Long = 1123456789L

  def address():String = "B-62,\nSector-56,\nNoida"

  def details():String = {
    name() + "\n" + number() + "\n" + address()
  }

}
class BankAccount(val name: String, val id: Int, val balance:Int)
{
  def this(name: String, id: Int) = this(name, id, 0)

  require(!name.isEmpty && id != 0, "Please provide your name")

  def credit(amt: Int): BankAccount = {
    new BankAccount(this.name, this.id, this.balance + amt)
  }

  def debit(amt: Int): BankAccount = {
    if(amt>this.balance){
      this
    }
    else {
      new BankAccount(this.name, this.id, this.balance - amt)
    }}

  override def toString: String = s"Hi $name! Balance for you Account ID $id is $balance"

}
/*object Assignment {
  implicit def panToID(x: String): Int = {
    val sum=0
    def retID(x:String, sum: Int,len:Int):Int = {
      if(len==0)
        sum
      else
      {
        if(x(len-1).isDigit)
        {
          val sum1 = sum + x(len-1).asDigit
          retID(x, sum1, len-1)
        }
        else
        {
          //println(x(len-1))
          val sum1 = sum + x(len-1)
          //println(sum1)
          retID(x, sum1, len-1)
        }
      }
    }
    retID(x, sum, x.length)
  }
  def main(args: Array[String]): Unit = {

    val a = new BankAccount("", "AZYPJ3462B")
    println(a)
    val b = a credit 200
    println(b)
    val c = b credit 1000
    println(c)
    val d = c debit 2000
    println(d)
    val e = d debit 1000
    println(e)
    println(BankAccount.name())
    println(BankAccount.address())
    println(BankAccount.number())
    println(BankAccount.details())
  }
}*/
