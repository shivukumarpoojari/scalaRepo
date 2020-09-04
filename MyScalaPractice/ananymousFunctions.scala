package MyScalaPractice

object ananymousFunctions {
  def +(x:Int,y:Int)=x+y

  def **(x:Int)=x*x

  def -(x:Int,y:Int)=x-y

  def /(x:Int,y:Int)=x/y

  def main(args: Array[String]): Unit = {
    println(ananymousFunctions.+(2,2))
    println(ananymousFunctions.-(5,3))
    println(ananymousFunctions.**(5))
    println(/(4,2))
    println(**(8))
     // ===================================ANANYMOUS FUNCTION=================//
    var add=(a:Int,b:Int)=>a+b
    println(add(300,500))
  }

}
