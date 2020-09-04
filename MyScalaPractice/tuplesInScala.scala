package MyScalaPractice
//Tuple is a class that can contain different kinds elements,tuples are immutable,tuple can contain upto 21 elements

object tuplesInScala {
  val mytuple=(1,2,"shri",true)
  val mytuple2=new Tuple3(1,2,"hello")
  val mytuple3=new Tuple2("hi","hello")
  val mytuple4=new Tuple3(222,336,("ram","ravi"))

  def main(args: Array[String]): Unit = {
    println(mytuple)
    println(mytuple._1)
    println(mytuple._4)
    println(mytuple._2)
    println(mytuple2._3)
    println(mytuple3._2)
    mytuple.productIterator.foreach{
      i=> println(i);

    }
    println(mytuple4._3._2)
    println(1->"Tom"->true)

  }


}
