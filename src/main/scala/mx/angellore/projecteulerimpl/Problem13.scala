package mx.angellore.projecteulerimpl

import io.Source

/**
 * Created by IntelliJ IDEA.
 * User: angellore
 * Date: 27/10/11
 * Time: 23:03
 * To change this template use File | Settings | File Templates.
 */

object Problem13 extends App {

  Source.fromFile("problem13.txt").getLines.foreach( line =>
    println(line)
  )

}