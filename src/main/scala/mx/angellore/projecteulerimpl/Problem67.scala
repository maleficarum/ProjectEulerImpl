package mx.angellore.projecteulerimpl

import scala.io._

/**
* http://projecteuler.net/index.php?section=problems&id=67
*
* @author Oscar Ivan Hernandez [ oscar at angellore dot mx]
*/
object Problem67 {
	
	def solve : Int = {
		var total:Int = 0
		
		Source.fromFile("triangle.txt").getLines.foreach((line) => { 
			var i:Int = 0
			line.split(" ").foreach((element) => {
				if(element.toInt > i) {
					i = element.toInt
				}
			})
			total += i
		})
		total
	}
	
	def main(args:Array[String]): Unit = {
		println(solve)
	}
}