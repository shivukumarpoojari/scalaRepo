package MyScalaPractice

//option is a container which can give 2 values,it can give instance of some and it can give instance of None

object optionsInscala {

  val lst=List(1,2,3,4,5)
  val map=Map(11->"gangu",12->"bindu",13->"bavana")
  val opt:Option[Int]=Some(55)//None

  def main(args: Array[String]): Unit = {

    println(lst.find(_>2))
    println(lst.find(_>6))
    println(lst.find(_>3).get)
    println(map.get(11))
    println(map.get(13).get)
    println(map.get(6).getOrElse("no name found"))
    println(lst.find(_>5).getOrElse(0))
    println(opt.isEmpty)
    println(opt.get)
  }


}
