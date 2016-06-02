package io.cambi.scala.methods

object FunctionCallByName {
	
	def main(args: Array[String]) {
		delayed(time)
	}
	
	def time() = {
		println("Milli seconds")
		System.nanoTime
	}
	
	def delayed(t : => Long) = {
		println("Delayed method")
		println("Milli Seconds " + t)
		t
	}

}