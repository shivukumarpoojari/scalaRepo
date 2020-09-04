package MyScalaPractice

object reduceFoldScanInScala {
  val lst=List(1,2,3,5,7,10,13)
val lst2=List("Amma","Appa","Anna","Attige")

  def main(args: Array[String]): Unit = {
     println(lst.reduceLeft(_+_))
    println(lst2.reduceLeft(_+_))
    println(lst.reduceLeft(((x,y)=>{println(x+","+y);x+y;})))
    println("============================================================")

    println(lst.reduceRight(_+_))
    println(lst2.reduceRight((_+_)))
    println(lst.reduceRight((x,y)=>{println(x+","+y);x+y}))
    println("===========================================================")

    println(lst.reduceRight(_-_))
    println(lst2.reduceRight((_+_)))
    println(lst.reduceRight((x,y)=>{println(x+","+y);x-y}))
    println("===========================================================")

    println(lst.foldLeft(100)(_+_))
    println(lst.foldLeft("z")(_+_))
    println(lst2.foldRight("z")(_+_))

    println(lst.scanLeft(100)(_+_))
    println(lst2.scanRight("R")(_+_))







  }

}
