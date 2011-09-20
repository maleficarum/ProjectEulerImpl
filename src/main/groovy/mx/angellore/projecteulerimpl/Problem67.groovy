package mx.angellore.projecteulerimpl

/**
* http://projecteuler.net/index.php?section=problems&id=67
*
* @author Oscar Ivan Hernandez [ oscar at angellore dot mx]
*/

class Problem67 {

	def solve() {
		def f = new File("triangle.txt")
		def total = 0
		f.eachLine { line ->
			def i = 0
			line.split(" ").each {
				def elemento = it as Integer
				if(elemento > i) {
					i = elemento
				}
			}
			total += i
		}
		total
	}
	
	static main(args) {
		def p = new Problem67()
		println "The max sum on path ${p.solve()}"
	}
	
}