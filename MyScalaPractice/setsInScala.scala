package MyScalaPractice
//sets is a collection of different elements of same data type.sets can not have a duplicate values inside it//
//all values inside a set must be unique//

object setsInScala {
  val myset:Set[Int]=Set(1,2,5,8,9,6,4,4,5,8)
  val myset2=scala.collection.mutable.Set(2,2,3,3,6,6,4,10)
    val names:Set[String]=Set("shivu","vru","darling")

  def main(args: Array[String]): Unit = {
    println(myset)
    println(myset+10)
    println(myset(8))
    println(names("max"))
    println(myset.head)
    println(myset.tail)
    println(myset.isEmpty)
    println(myset.++(myset2))
    println((myset ++ names))
    println(myset.&(myset2))
    println(myset.intersect(myset2))
    println(myset.max)
    println(myset.min)
    myset.foreach(println)
    for(name <- names){
      println(name)
    }



  }

}
