package MyScalaPractice
//function currying is the technique of transforming function

object functionCurryingInScala {
  def add(x:Int,y:Int)=x+y
  def add2(x:Int)=(y:Int)=>x+y
  def add3(x:Int)(y:Int)=x+y

  def main(args: Array[String]): Unit = {
    println(add(10,15))
    val sum40=add2(40)
    println(sum40(50))
    println(add3(52)(80))
    val sum50=add3(50)(_)
    println(sum50(5))
  }

}
