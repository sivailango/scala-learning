/**
 *
 */
package io.cambi.scala.basics

/**
 * @author valore
 *
 */
object Variables {
  
  def main(args: Array[String]) {
    
    var name = "Siva"
    println(s"Hello $name")  // Hello Siva
    
    var age: Int = 26
    println(s"Age is $age")  // Age is 26
    
    val NATIONALITY = "Indian"
    println(s"Nationality $NATIONALITY")
    
    var myVariable: String = "I am variab le with type";
    var myVariableWithoutType = "I am variable without type";
    
    println(s"$myVariable \t $myVariableWithoutType")
    
    var (x, y) = (10, 20);
    println(s"x = $x \t y = $y")
    
    val PI = 3.14 // final variable
    println(PI)
    
    // multiple variables
    var a, b, c = 0
    var java, scala, python = true
    
    var (product, price, inStock) = ("Oneplus 3", 300.00, true)
    println(product, price, inStock)
    
  }

}