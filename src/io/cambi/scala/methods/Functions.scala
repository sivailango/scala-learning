package io.cambi.scala.methods

object Functions {

	def main(args: Array[String]): Unit = {
    
		println(sum(10, 20))
    
		sayHello()
		println(singleline())
    
		val (x, y) = swap(10, 20)
    
		println(x, y)
    
    println(partialFunction(3))  // 5
    
    println(curriedFunction(3)(2))  // 6
    
    val timesTwo = curriedFunction(2)_
    
    println(timesTwo(4))  // 8
    
    println(capitalizeAll("one", "two"))
    
	}
  
  def methodName(arg1: String, arg2: Int): Unit = {
    // block of code
    // return
  }
  
  def capitalizeAll(args: String*) = {
    args.map { arg =>
      arg.capitalize
    }
  }
	
	def singleline() = "Hello!"
	
	def sum(a: Int, b: Int): Int = {
		return a + b;
	}
  
  def singleLine(a: Int): Int = a + 2
	
	def sayHello() {
		println("Hello World from Scala!")
	}
	
	def swap(x: Int, y: Int) = (y, x)	// Tuples
  
  def partialFunction = add(2, _:Int)
  
  def add(x: Int, y: Int) = x + y
  
  def curriedFunction(x: Int)(y: Int) = x * y  
	
}