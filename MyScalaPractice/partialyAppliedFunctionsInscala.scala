package MyScalaPractice

object partialyAppliedFunctionsInscala {
  def main(args: Array[String]): Unit = {
    val sum=(x:Int,y:Int,z:Int)=>x+y+z
    val f=sum(100,200,_:Int)
    println(f(100))
    println(f(3))
  }

}
