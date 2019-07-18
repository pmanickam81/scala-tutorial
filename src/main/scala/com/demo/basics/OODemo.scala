package com.demo.basics

object OODemo extends  App{

  val person = new Person("M", 37)

  //println(person.name) This will not work. Class parameters are not fields, to fix this change the type to val

  println(person.sayGreet("P"))

}

class Person(name:String, age:Int){

  def sayGreet(name:String):Unit = println(s"${this.name} says: Hi, $name")

}