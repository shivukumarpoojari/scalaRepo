package MyScalaPractice

import java.util.Date


object partialyAppliedFunctions2Inscala {
  def log(date:Date,message:String)={
    println(date+"   "+message)
  }

  def main(args: Array[String]): Unit = {
    val sum=(x:Int,y:Int,z:Int)=>x+y+z
    val f=sum(20,_:Int,_:Int)
    println(f(30,10))
    val date=new Date()
    val newlog=log(date,_:String)
    newlog("this is my first message1")
    newlog("this is my second message")
    newlog("this is my third  message")
  }
}
