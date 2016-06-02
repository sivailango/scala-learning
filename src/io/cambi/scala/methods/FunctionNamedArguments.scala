package io.cambi.scala.methods

object FunctionNamedArguments {
	
	def main(args : Array[String]) = {
		sum(a = 5, b = 7);
	}
	
	def sum(b: Int, a: Int) = {
		println("a = " + a)
		println("b = " + b)
	}

}