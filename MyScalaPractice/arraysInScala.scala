package MyScalaPractice
import Array._
import scala.Array

object arraysInScala {
val arr=Array(1,2,3,4,5,6,7,8)
  val arr1 = Array(10,20,30,40)
  val myarray=new Array[Int](5)


  def main(args: Array[String]): Unit = {

    val a1=arr:+9
    for(x<-a1){
      println(x)

    }
    println("==============================================")

    val a2=a1:+10
    for(x<-a2){
      println(x)
    }
    println("==============================================")

    val a3=10+:a1
    for(x<-a3){
      println(x)
    }
    println("==============================================")

    val a4=arr ++ arr1
    for(x<-a4)
      println(x)
    println("===============================================")

    val a5=arr.reverse
    for(x<-a5)
      println(x)
    println("==============================================")

    val a6=new Array[Int](5)
      for(x<-a6)
        println(x)
    println("==============================================")
    arr1.foreach(println)
    println("==============================================")
    println(arr.max)
    println("==============================================")
    println(arr.min)
    println("==============================================")
    println(arr.sum)
    println("==============================================")
    println(arr.sum/arr.length)
    println("==============================================")
    println(arr.length)
    println("==============================================")
    println(arr.size)
    println("==============================================")

    arr.update(2,88)
    for(x<-arr)
      println(x)
  println("==============================================")


    arr1(0)=55
  for(x<-arr1) {
      println(x)
    println("==============================================")
   }

    println(arr1(0))
    println(arr.mkString(","))
    println(arr.mkString("(",":",")"))                         //DOUBT//
    println("==============================================")


    val ar=arr.drop(2)
    for(x<-ar) {
      println(x)
    }
    println("==============================================")

    val ar1=arr.distinct
    for(x<-ar1) {
      println(x)
    }
    println("==============================================")
    myarray(0)=11
    myarray(1)=21
    myarray(2)=51
    myarray(3)=27
    myarray(4)=23
    println(myarray)
    println("==============================================")


    for (i<-0 to (myarray.length-1)){
      println(myarray(i))
    }
    println("==============================================")

    val result=concat(arr,myarray)
    for (x<-result){
      println(x)
    }








  }
}
