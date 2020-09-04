package MyScalaPractice

object stringInterpulation {
  def main(args: Array[String]): Unit = {
    val name="shivu"
    val age =27
    println(name +" is "+age +" years old")
    println(s"$name is $age years old")      // s type string interpulation//
    println(f"$name%s is $age%d years old")  // f type string interpulation//
    println(s"hello \n world")
    println(raw"hello \n world")
  }
}
