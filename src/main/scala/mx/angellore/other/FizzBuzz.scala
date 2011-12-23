package mx.angellore.other

/**
 * solucion a http://codingdojo.org/cgi-bin/wiki.pl?KataFizzBuzz
 * User: angellore Oscar Ivan Hernandez Ventura [ oscar at angellore dot mx ]
 * Date: 22/12/11
 * Time: 22:25
 */

object FizzBuzz extends App {

  (1 to 100).foreach(arg =>
    if (arg % 3 == 0) {
      println("FIZZ")
    } else if (arg % 5 == 0) {
      println("BUZZ")
    } else {
      println(arg)
    }
  )


}