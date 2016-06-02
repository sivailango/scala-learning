package io.cambi.scala.loops

object LoopStatements {
	
	def main(args: Array[String]) = {
		
		var age = 10;
		
		var i = 0;
		
		while(i < age) {
			println(i)
			i += 1 
		}
		
		i = 1;
		
		do{
        	println( "Value of i: " + i );
         	i = i + 1;
      	} while(i < 20)
      		
      	for(i <- 0 until 10) {
      		println(i)
      	}
      	
      	println((0 until 10).sum)
      		
	  }
  
    for(i <- 0 to 9) {
      println("Value " + i)
    }
    
    for(i <- Range(0, 10)) {
      println("Range " + i)
    }
    
    
    for(i <- Range(0, 10, 2)) {
      println("Range " + i)
    }

    println(Range(0,10).inclusive)
    
}