package MyScalaPractice

object IfElseStatementsInScala {   //if else statements allows us to execute boolean expressions based on the result of expressionie true or false//
  def add(x:Int):Int= {
    if (x > 0) {
      x + add(x - 1)
    } else {
      x
    }
  }

  def main(args: Array[String]): Unit = {
    val x=20;
    var res=" ";
    if(x==20){
      res="x==20";
    }
    else
      {
        res="x!=20";
      }
    println(res)
//=================================================================//
  val a=230
  val b=30
  var ress=" "
  if(a==20 && b==30) {
    ress = "a==20 && b==30 "
  }
    else{
     ress= "a!=20"
    }

println(ress)
//=====================================================//
    val z=20;
    println(if(z==20)"z==20" else "z!=20")

//============================================//
   val t=55
if(t==55) {
  println("t is equal to 55")
}
    else{
println("t is not eqal to 55")}
  }
  }
