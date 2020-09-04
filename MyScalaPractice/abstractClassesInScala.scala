package MyScalaPractice
//if a class is a declred as abstract it can not be instantiated
//an abstract class does a few things for the inherting the subclass
//define methods which can be used by the inherting subclass
//define abstract methods which the inheriting subclass must impliment
//provide a common interface which allows the subClass to be interchanged with other subClases

class polygan
{
  def area:Double=0.0
}


class Rectangle(var width:Double,var height:Double) extends polygan
{
  override def area:Double=width*height
}

class Triangle(var width:Double,var height:Double) extends polygan{
  override  def area:Double=width*height/2
}



object abstractClassesInScala {
  def main(args: Array[String]): Unit = {
    var poly = new polygan
    var rect = new Rectangle(55.2, 20.2)
    printArea(rect)
    var tri = new Triangle(55.2, 20.0)   //DOUBT//
  }


  def printArea(p:polygan) {
    println(p.area)
  }

}
