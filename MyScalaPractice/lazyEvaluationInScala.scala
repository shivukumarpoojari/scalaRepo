package MyScalaPractice

//which delays the evaluation of expression untill the value is needed

class strict{           //DOUBT//
  val e={
    println("strict")
    9
  }
}

class lazyEval{
  lazy val l={
    println(" this is lazy")
    81
  }
}

object lazyEvaluationInScala {
  def main(args: Array[String]): Unit = {
    val x=new strict
    val y=new lazyEval
    println(x.e)
    println(y.l)
  }

}
