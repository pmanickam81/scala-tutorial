package com.demo

object ExpressionDemo extends App{

  val x = 1+2

  println(x)

  println(x + 3)

  println(x == 3)

  var b = 34
  b += 4
  println(b)

  b -= 4
  println(b)

  val aCondition = true
  val aValue = if(aCondition) 10 else 5 //IF Expression
  println(aValue)

  println(if(aCondition) 10 else 5)

  var i=1
  val aWhile = while(i<3){
    println(i)
    i += 1
  }

  println(aWhile)

  val aCodeBlock = {
    val a = 1; b =2
    if(a<b)"Hello" else "Hi"
  }

  println(aCodeBlock)

  val someValue = { 2 < 3}
  println("Some Value is --> " +someValue)

  val someOtherValue = {
    if(someValue) 10 else 100
    99 // This will be the return value
  }
  println("Some Other value is -->" + someOtherValue)
}
