/**
 *
 */
package com.aurum.scala;

/**
 * 
 * Indention should allow 2-space
 * Line wrapping 80
 * 
 * Packages should follow the Java conventions
 * 
 * @author valore
 *
 */
object StyleGuide {
  
  var message = "Hello Wolrd";
  var isValid = true
  
  if (isValid) isValid else isValid
  for (i <- 0 to 10) { println("Hello, World!") }
  while (true) { println("Hello, World!") }
  
  // Constant shuld be Camel case with upper first letter
  val MyConstant = "Hello"
  
  def foo(bar: String): String = {
    "welcome"
  }
  
  // If there is if/else, no need to use curly brace
  val news = if (isValid)
    goodNews()
  else
    badNews()
   
  // If only if clause, then should use brace  
  if (isValid) {
    println("foo was true")
  }
  
  news match {
    case "good" => println("Good news!")
    case "bad" => println("Bad news!")
  }
  
  // Conditional operator
  val res = if (isValid) isValid else isValid
  
 /**
  * Default values
  *  
  * @param bar
  * @return
  */
  def bar(bar: String = "bar"): String = {
    "welcome"
  }
  
  def goodNews(): String = {
    "good"
  }
  
  def badNews(): String = {
    "bad"
  }
  
}

/**
 * Camel case with upper first letter
 *
 */
class MyFirstClass {
  
  /**
  * Camel case 
  * Curly braces on the same line
  */
  def sayhello() {
    
  }
  
}

/**
 * Indent 4 for class fields
 *
 */
class Person(
    name: String,
    age: Int,
    astrologicalSign: String,
    shoeSize: Int,
    favoriteColor: java.awt.Color) {
  def firstMethod: String = {
    "welcome"
  }
}

