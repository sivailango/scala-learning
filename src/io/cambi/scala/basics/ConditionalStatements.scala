package io.cambi.scala.basics

object ConditionalStatements {
	
	def main(args: Array[String]) = {
		
		var isValid = true;
		
		if(isValid) {
			println("Yes its valid")
		}
		
		var age: Int = 30;
		
		if(age > 40)
			println("You are too old")
		else
			println("You are young")
		
		if(age == 40) {
			println("You are at 40")
		} else if (age == 50) {
			println("You are at 50")
		} else if (age == 30) {
			println("You are at 30")
		} else {
			println("You are at 60")
		}
		
		if(isValid) println("True") else println("False")
    
    isValid = {
      if(3 > 5)
        true
      else
        false
    }
    
    println(isValid)
		
	}

}