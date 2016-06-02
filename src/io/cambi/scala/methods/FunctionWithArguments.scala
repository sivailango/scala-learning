package io.cambi.scala.methods

object FunctionWithArguments {
	
	def main(args: Array[String]) = {
		prindValues("Hello", "Scala", "World")
	}
	
	def prindValues(args : String*) = {
		var i: Int = 0;
		for(arg <- args) {
			println("Array [" + i + "] value " + arg)
			i = i + 1;
		}
	}

}