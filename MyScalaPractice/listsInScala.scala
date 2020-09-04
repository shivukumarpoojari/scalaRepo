package MyScalaPractice

// lists are similar to Array they are the collection of similar datatype elements the difference between the array and list is
// array is mutable and flat where list is immutable and it represents the link lists

object listsInScala {
  val lst:List[Int]=List(1,2,3,4,5,6,7,8)
  val mynames:List[String]=List("shivu","vru","darling","Dyani")

  def main(args: Array[String]): Unit = {
    println(lst.drop(2))
    println(lst.init)
    println(lst.last)
    println(lst.slice(2,6))
    println(lst.splitAt(3))
    println(lst.take(4))
    println(lst.takeRight(4))
    println(mynames.contains("shivu"))
    println(lst.contains(4))
    println(lst.contains(44))
    println(lst.endsWith(List(6,7,8)))
    println(lst.isEmpty)
    println(mynames.nonEmpty)
    println(lst.startsWith(List(1,2,3)))
    println(lst.lastIndexOf(6))
    println(lst.mkString(","))
    println(lst.mkString(":"))
    println(mynames.mkString(":"))
    println(lst.zip(lst.reverse))
    println(mynames.zipWithIndex)
    println(lst.count(_>5))
    println(lst.dropWhile(_>5))          //DOUBT//
    println(lst.filter(_>5))
    println(lst.exists(x=>x/2==0))
    println(lst)
    println(mynames)
    println(0::lst)
    println(1::5::9::Nil)
    println(mynames.tail)
    println(mynames.head)
    println(mynames.reverse)
    println(List.fill(5)(6))
    lst.foreach(println)
    var sum:Int=0
    lst.foreach(sum+= _)
   println(sum)


    for(names<-mynames){
      println(names)
    }
    println(mynames(0))
    println(lst.max)






  }


}
