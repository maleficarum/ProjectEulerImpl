package mx.angellore.other

/**
 * solucion a http://codingdojo.org/cgi-bin/wiki.pl?KataFizzBuzz
 * User: angellore Oscar Ivan Hernandez Ventura [ oscar at angellore dot mx ]
 * Date: 22/12/11
 * Time: 22:25
 */

object FizzBuzz extends App {

  for (i <- 1 to 100) {
    if ((i % 3) == 0) {
      println("Fizz")
    } else if ((i % 5) == 0) {
      println("Buzz")
    } else {
      println(i)
    }
  }


}