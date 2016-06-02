/**
 *
 */
package io.cambi.scala

/**
 * @author valore
 *
 */
object HelloWorld {
  
  def main(args: Array[String]) {
    println("Hello")
    println(s"1 + 1 = ${1 + 1}")
    
    val height = 1.9d
    val name = "James"
    println(f"$name%s is $height%2.2f meters tall")
  }
  
}