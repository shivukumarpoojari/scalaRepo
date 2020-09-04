package MyScalaPractice

object forLoopsInScala {
  def main(args: Array[String]): Unit = {
    for(i<- 1 to 5){
      println("i using to "+i)
    }

    //=========================================================//
    for(j<-1.to(6)){
      println("j using to  "+j)
    }

   //=======================================================//
    for(x<- 1 until(8)){
      println("x using untill "+x)
    }

    //=======================================================//
    for(k<- 1 to 9;    l<-1 to 3){
      println("k using untill "+k+" "+l)
    }

    //==============================================================//
    val lst=List(2,8,7,6,2,1,3,6,4)
    for(m<-lst){
      println("m using lst "+m)
    }

   //===============================================================//
    for(m<-lst; if m<4) {
      println("m using lst " + m)
    }

    //==============================================================//

    val result=for{p<-lst;if p<5} yield {
      p*p
    }                                       // using for loop as an expression//
    println("result="+result)
  }

}
