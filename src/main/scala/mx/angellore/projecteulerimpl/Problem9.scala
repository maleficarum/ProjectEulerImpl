package mx.angellore.projecteulerimpl

/**
 * Created by IntelliJ IDEA.
 * User: angellore
 * Date: 10/28/11
 * Time: 10:20 AM
 */

object Problem9 extends App {

  def T(total:Int) : Tuple3[Int, Int, Int] = {
    var tup:Tuple3[Int, Int, Int] = null
    for(x <- 1 to  total; y <- 1 to total; z <- 1 to total - x - y) {
      if(x * x + y * y == z * z && x + y + z == total && x < y && y < z) {
        println(x +  " " + y + " " + z)
        tup = new Tuple3[Int, Int, Int](x,y,z)
      }
    }
    tup
  }

  var t = T(1000)
  println(t._1 * t._2 * t._3)
}

