package MyScalaPractice

//map is typically used to iterate over the collection,it can be array or list or set
// then apply the function to the each element of that collection

object mapInScala {
  val numbers=List(1,2,8,7,5,2,3)
  val kvPairs=Map(1->"sahana",2->"gita",3->"shravani",4->"manvita")

  def main(args: Array[String]): Unit = {
    println(numbers.map(_*2))
    println(numbers.map(x=>x/0.2))
    println(numbers.map(x=>x*8))
    println(numbers.map(x=>"hi "+x))
    println(numbers.map(x=>"hi"*x))
    println(kvPairs.mapValues(x=>"hi "+x))
    println("hello".map(_.toUpper))
    println(List(List(1,2,3),List(3,4,5)).flatten)
    println(numbers.flatMap(x=>List(x,x+1)))
    println(numbers.map(x=>(x,x+1)))
    println(numbers.filter(x=> x/2 ==0))
    println(numbers.filter(x=> x/2 !=0))
  }

}
