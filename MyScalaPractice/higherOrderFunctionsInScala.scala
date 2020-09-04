package MyScalaPractice

//higher order functions are those functions which are able to take functions as argument and are able to return function these type of functions are called higher order functions


object higherOrderFunctionsInScala {
def math(x:Double,y:Double,f:(Double,Double)=>Double):Double=f(x,y)                   //using 2 arguments//
  def mathh(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double=f(f(x,y),z)  //using 3 arguments//

  def main(args: Array[String]): Unit = {
    val result=math(200,300,(x,y)=>x max y)
    val result1=math(20,30,(x,y)=>x min y)
    val result2=math(13,50,(x,y)=>x +y)
    val result3=math(50,40,(x,y)=>x-y)
    val result33=math(50,40,_+_)              // using voild cards//
    val result4=mathh(50,40,10,_+_)
    val result5=mathh(50,40,20,_-_)
    val result6=mathh(50,40,20,_ max _)
    val result7=mathh(50,40,20,_ min _)
    val result8=mathh(5,4,20,_*_)
    val result9=mathh(50,40,20,_/_)






    println(result)
    println(result1)
    println(result2)
    println(result3)
    println(result33)
    println(result4)
    println(result5)
    println(result6)
    println(result7)
    println(result8)
    println(result9)
  }
}
