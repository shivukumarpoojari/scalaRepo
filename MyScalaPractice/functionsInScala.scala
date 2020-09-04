package MyScalaPractice

object functionsInScala {    // functions are group of statements that perform particular task//
  def add(x:Int,y:Int):Int={
    return x+y
  }

  def sub(x:Int,y:Int):Int={
    x-y
  }

  def multiply(x:Int,y:Int):Int=x*y

  def devide(x:Int,y:Int)=x/y

  def square(x:Int)=x*x

  def addition(x:Int,y:Int)=x+y

  def sum(x:Int=25, y:Int=20)=x+y

  def main(args: Array[String]): Unit = {
    println(add(2,2))
    println(sub(5,3))
    println(multiply(5,5))
    println(devide(4,2))
    println(square(8))
    println(functionsInScala.square(9))
    println(functionsInScala.addition(2,8))
    println(functionsInScala.sum(200,300))
  }


}
