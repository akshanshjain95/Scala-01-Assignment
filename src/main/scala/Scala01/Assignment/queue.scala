package Scala01.Assignment

  trait queue {
    def enqueue(x:Int):queue

    def dequeue:queue
  }

  class DoubleQueue(l:List[Int]) extends queue {
    override def enqueue(x:Int): DoubleQueue = {
      val dubx = 2*x
      val l1 = (dubx :: l.reverse).reverse
      new DoubleQueue(l1)
    }

    override def dequeue: DoubleQueue = {
      val l1 = l.tail
      new DoubleQueue(l1)
    }
    override def toString: String = s"$l"
  }

  class SquareQueue(l:List[Int]) extends queue {

    override def enqueue(x:Int): SquareQueue = {
      val sqx = x*x

      val l1 = (sqx :: l.reverse).reverse
      new SquareQueue(l1)
    }

    override def dequeue: SquareQueue = {
      val l1 = l.tail
      new SquareQueue(l1)
    }
    override def toString: String = s"$l"
  }

/*  object Person3 extends App {
    val l = List(1,2,3,4,5,6)
    val o = new DoubleQueue(l)
    val o1 = new SquareQueue(l)
    val o2 = o.enqueue(10)
    println(o.enqueue(10))
    println(o1.enqueue(10))
    println(o.dequeue)
    println(o1.dequeue)
    println(o2)
    println(o)

  }*/
