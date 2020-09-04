package MyScalaPractice

object matchExpressionInScala {          //match expression is used to select between list of alternative justlike if or multipleif conditions//
  def main(args: Array[String]): Unit = {
    val age=40
    age match {
      case 20=>println(age)
      case 18=>println(age)
      case 30=>println(age)
      case 40=>println(age)
      case _=>println("default")
    }

    //=============================================================//
     val oldage="58"
    val result=oldage match {
      case "40" => oldage
      case "50" => oldage
      case "55" => oldage
      case "60" => oldage
      case _ => "default"

    }
    println("result= "+result)

    //===========================================================================//
    val i =8
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("the number is odd")
      case 2 | 4 | 6 | 8 | 10 => println("the number is even")
    }
  }


}
