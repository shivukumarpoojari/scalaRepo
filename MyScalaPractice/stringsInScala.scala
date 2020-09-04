package MyScalaPractice
//string is a sequence of charactor
object stringsInScala {
  val str = "Hello World"
  val time = "10:20:30"
  val num1=75
  val num2=100.25
  val str1="shivukumarpoojari"

  def main(args: Array[String]): Unit = {
    println(str.charAt(0))
    println(str.indexOf("H"))
    println(str.lastIndexOf("o"))
    println(str.size)
    println(str.length)
    println(str.concat(" "+time))
    println(str.split(" "))
    println(str.splitAt(2))
    println(str.reverse)
    println(str.head)
    println(str.substring(2))
    println(str.substring(0,5))
    println(str.contains("H"))
    println(str.toUpperCase())
    println(str.toLowerCase)
    val result=printf("(%d--%f--%s)",num1,num2,str1)
    println(result)
    println("(%d--%f--%s)".format(num1,num2,str1))


  }

}
