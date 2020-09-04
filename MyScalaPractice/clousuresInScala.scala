package MyScalaPractice
//closure is a function which uses one or more variables declared outside this function//

object clousuresInScala {
  var number=10
  val sum=(x:Int)=>x+number

  def main(args: Array[String]): Unit = {
    println(sum(55))
  }

}
