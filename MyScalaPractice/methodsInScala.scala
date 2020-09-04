package MyScalaPractice
//NOT EXECUTING//

object methodsInScala {
  def method1(n:Int): Unit ={
    println("method1")
    println(n)
  }

  def method2(n: =>Int){
    println("method2")
    println(n)
  }

  def main(args: Array[String]): Unit = {
    val add=(a:Int,b:Int)=>{
      println("add")
      a+b
    }
    method1(add(5,6))
    method2(add(2,6))
  }
}
