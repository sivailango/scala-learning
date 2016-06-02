/**
 *
 */
package io.cambi.scala.classes

/**
 * var - getter and setter
 * val - getter
 * neither val or var - not a member
 * 
 * @author valore
 *
 */
object Classes {
  
  def main(args: Array[String]) = {
    
    var personA = new PersonA("Siva", "Ilango")
    println(personA.firstName)
    
    personA.firstName = "Sivaaa"
    println(personA.firstName)
    
    val personB = new PersonB("Siva")
    // personB.firstName = "Ilango"  // reassingment to val
    
    val personC = new PersonC("Siva")
    // personC.firstName = "Siva"  // firstName is not a member of PersonC
    
    println(new Pizza)
    println(new Pizza(14))
    println(new Pizza(16, "Thick"))
    
    val me = PersonD("Siva", "Ilango")
    println(me)
    println(me.firstName)
    
  }

}

class PersonA(var firstName: String, var lastName: String) {
  
  def displayFullName {
    println(firstName + " " + lastName)
  }
  
  displayFullName
  
}

class PersonB(val firstName: String) {}

class PersonC(firstName: String) {}

class Pizza {
 
  var crustSize = 12
  var crustType = "Thin"
   
  def this(crustSize: Int) {
    this()
    this.crustSize = crustSize
  }
 
  def this(crustSize: Int, crustType: String) {
    this(crustSize)
    this.crustType = crustType
  }
 
  override def toString = {
    "A %s inch pizza with %s crust.".format(crustSize, crustType)
  } 
 
}

/**
 * No need to use "new" keyword to access case class object
 * Parameters becomes public
 * Scala generates toString, hashCode, equals
 */
case class PersonD(firstName: String, lastName: String)