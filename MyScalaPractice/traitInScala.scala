package MyScalaPractice
//In order to overcome diamond error we will go for traits where we can extend from multiple traits //


trait shape{
 def color:String
}



abstract class polygon{
  def area:Double
}



class Rectangles(var width:Double,var height:Double) extends polygon with shape
{
  override def area:Double=width*height
  def color:String="red"
}



class Triangles(var width:Double,var height:Double) extends polygon with shape {
  override  def area:Double=width*height/2
  def color:String="green"
}



object traitInScala {
  def main(args: Array[String]): Unit = {
    var rect=new Rectangles(55.2,20.0)
    printArea(rect)
    println(rect.color)
    var tri=new Triangles(55.2,20.2)
    printArea(tri)
    println(tri.color)
  }
def printArea(p:polygon): Unit ={
  println(p.area)
}
}
