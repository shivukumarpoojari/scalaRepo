package MyScalaPractice
//in scala classes can be extended by creating new classes which can retain the charecterstics of base class
//this procces is known as a inhertance
//it involves the subclass and base class
//subclass inherits the members of baseclass on top of which it adds the its own members

class polygane
{
  def area:Double=0.0
}


class Rectanglee(var width:Double,var height:Double) extends polygane
{
override def area:Double=width*height
}

class Trianglee(var width:Double,var height:Double) extends polygane
{
  override  def area:Double=width*height/2
}



object inheritenceInScala {
  def main(args: Array[String]): Unit = {
    var poly = new polygane
    var rect = new Rectanglee(55.2, 20.2)
    printArea(rect)
    var tri = new Trianglee(55.2, 20.0)
  }


    def printArea(p:polygane) {
      println(p.area)
    }

}

