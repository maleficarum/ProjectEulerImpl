package mx.angellore.projecteulerimpl

object Problem1 extends App{
		println((1 to 999).filter((i:Int) => (i % 3 == 0) || (i % 5 == 0)))
}