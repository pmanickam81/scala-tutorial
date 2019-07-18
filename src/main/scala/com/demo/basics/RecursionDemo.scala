package com.demo.basics

object RecursionDemo extends App {

  // Call By Value and Call By Ref
  def callByValue(x:Long):Unit = {
    println("Called By Value " + x)
    println("Called By Value " + System.nanoTime())
  }

  def callByReference( x: => Long):Unit = {
    println("Called By Value " + x)
    println("Called By Value " + x)
  }

  callByValue(System.nanoTime())
  callByReference(System.nanoTime())

  // Named Arguments
  def testFunction(a:Int, b:Int=10) = println(a, b)

  testFunction(100)

  def anotherFunction(a:String = "Hello", b:Int = 1, c:Int = 2):Unit = println(a, b, c)

  anotherFunction(b=20, c=30)

  anotherFunction(b=20, c=30, a= "Hi")

  val str:String = "I'm learning Scala"

  println(str.charAt(4))
  println(str.substring(4, 10))
  println(str.split(" ").toList)

}
