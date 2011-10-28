package mx.angellore.projecteulerimpl

import io.Source

/**
 * Created by IntelliJ IDEA.
 * User: angellore
 * Date: 27/10/11
 * Time: 23:03
 */

object Problem13 extends App {

  var result:BigInt = 0

  Source.fromFile("problem13.txt").getLines.foreach((line) => { result = BigInt(line).+(result) })

  println(result.toString().substring(0,10))

}