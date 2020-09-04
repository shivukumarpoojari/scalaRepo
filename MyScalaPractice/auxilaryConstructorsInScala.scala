package MyScalaPractice

//Auxilary constructors are the alternative constructors in scala
class User(var name:String,var age:Int){
  def this(){
    this("Swathi",32)
  }
  def this(name:String){
    this(name,32)
  }
}

object auxilaryConstructorsInScala {
  def main(args: Array[String]): Unit = {
    var user1=new User("poojari",28)
    var user2=new User()
    var user3=new User("mallu")
    println(user1.name,user1.age)
    println(user2.name,user2.age)
    println(user3.name,user3.age)
  }

}

