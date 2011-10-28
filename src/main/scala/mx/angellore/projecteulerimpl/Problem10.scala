package mx.angellore.projecteulerimpl

import utils.Prime

/**
 * Created by IntelliJ IDEA.
 * User: angellore
 * Date: 10/28/11
 * Time: 12:42 PM
 */

object Problem10 extends App {

  var sum:Int = 0
  Prime(2000000).foreach( e => sum += e )
  println(sum)
}