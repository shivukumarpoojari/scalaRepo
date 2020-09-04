package MyScalaPractice
//when we are able to the variable ie pure(var)
//when we are not able to change the variable ie impure(val)

object clousuresInScala2 {
var number=10
val add=(x:Int)=>{
  number=x+number
  number
}

  def main(args: Array[String]): Unit = {
    number=100
    println(add(20))
    println(number)
  }


}
