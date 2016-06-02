package io.cambi.scala.methods

object FunctionDefaultParam {
	
	def main(args: Array[String]) {
		println(myMethod())
	}
	
	def myMethod(a: Int = 10, b: Int = 10): Int = {
		return a + b;
	}

}