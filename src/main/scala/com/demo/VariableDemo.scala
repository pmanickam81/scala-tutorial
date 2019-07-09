package com.demo

object VariableDemo extends  App {

  // val is immutable and compiler can infer the types

  val x: Int = 5
  println(x)

  val a = 10
  val b =20
  println(a, b)

  val myString = "Hello World" ; val anotherString = "This kind of code is not recommended"
  println(myString)

  val aBool:Boolean = false

  val myChar:Char = 'a'

  val myInt:Int = 13

  val myShort:Short = 23423

  val myLong:Long = 134L

  val myFloat:Float = 23.45f

  println(aBool + "-" + myChar  + "-" + myInt  + "-" + myShort  + "-" + myLong  + "-" + myFloat)

  var myVar = "Hello World"
  println(myVar)

  myVar = "Updated Here"
  println(myVar)
}
