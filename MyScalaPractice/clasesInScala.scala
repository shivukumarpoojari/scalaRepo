package MyScalaPractice

//classes in scala  are the blueprint of a creating object

object clasesInScala {

  class User(var Name:String,var Age:Int)
  {
    def printName{println(Name)}
    def printAge{println(Age)}

  }

  def main(args: Array[String]): Unit = {
    var user=new User("max",27)
    println(user.Name)
    println(user.Age)
    user.printName
    user.printAge
    user.Name="Siddu"
    user.Age=25
    println(user.Name)
    println(user.Age)


  }



}
