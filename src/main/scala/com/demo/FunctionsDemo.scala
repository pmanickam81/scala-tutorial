package com.demo

object FunctionsDemo extends App {

  def aFunction(a: String, b: String): String = a + " " + b //Function Expression

  println(aFunction("Hello", "World"))

  def aFuncWithoutParams(): Int = 100 //Function without Parameter

  println(aFuncWithoutParams)

  println(aFuncWithoutParams())

  def aRepeatedFunction(str: String, n: Int): String = {
    if (n == 1) str
    else str + " " + aRepeatedFunction(str, n - 1)
  }

  println(aRepeatedFunction("Hello", 3))

  def sayGreeting(name: String, age: Int) = "Hello, I am %s and my age is %d".format(name, age)

  println(sayGreeting("Mani", 36))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  println(factorial(5))


  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(10))
}
