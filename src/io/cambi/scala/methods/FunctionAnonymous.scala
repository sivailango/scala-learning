package io.cambi.scala.methods

import java.util.Date

object FunctionAnonymous {

	def main(args: Array[String]) = {
		
		var inc = (x: Int) => x + 1;
		println(inc(5))
		
		var mul = (x: Int, y: Int) => x * y;
		println(mul(5, 3))
		
		var noParam = () => { new Date }
		println(noParam)
		
		val add = (x: Int, y: Int) => x * y
		val multiply:(Int, Int) => Int = _ * _
		val divide = (_ / _): (Int, Int) => Int 
		
	}
	
}