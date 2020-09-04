package MyScalaPractice
//Map is a collection of key value pairs in scala,keys are unique in map
// 1) mutable     2)Immutable

object mapsInScala {
  val myMap:Map[Int,String]=Map(802->"darling",801->"Dyani",805->"praba",804->"July")
  val myMap2=Map(806->"shivu",807->"vru",808->"tarun")

  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(802))
    println(myMap(804))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)
    myMap.keys.foreach{key=>
      println("key "+key)
     println("Values "+myMap(key))
    }
    println(myMap.contains((801)))
  println(myMap ++ myMap2)
    println(myMap.size)

  }

}
