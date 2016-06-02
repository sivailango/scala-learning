package io.cambi.scala.methods

object FunctionHighOrder {
	
	def main(args : Array[String]) {
		//println(apply(layout, 10))
		println(sumOfTwoOperations(squard, 2, 5))
		println(sumOfTwoOperations(cubes, 2, 5))
		
		val list = List(1, 2, 3, 4)
		var isExist = list.exists {isEqualToFour}
		//var isExist = list.exists(isEqualToFour)
		println(isExist)
		
		val resultForall4 = list.forall(isEqualToFour)
		println(resultForall4)
	}
	
	def apply(f: Int => String, v: Int) = f(v)
	
	def layout[A](x : A) = {
		"[" + x + "]"
	}
	
	// Takes input as Int and return Int as value
	def sumOfTwoOperations(f: Int => Int, a: Int, b: Int) = {
		f(a) + f(b)
	}
	
	def squard(x: Int) = x * x;
	
	def cubes(x: Int) = x * x * x;
	
	def isEqualToFour(x: Int) = x == 4
}