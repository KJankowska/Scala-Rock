package lectures.part1Basic

object Function extends App {

  def aFunction(a: String, b: Int): String = {
    a + "" + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello ", 3))

  def greetings(name: String, age: Int): Unit =
    "Hi, My name is " + name + "and I'm " + age + "years old"
    println(greetings("Bob", 13))

    def factorial(n: Int): Int =
      if (n <= 0) 1
      else n * factorial(n - 1)

      println(factorial(5))


      def fibonaci (n : Int) : Int =
        if (n <= 2) 1
        else fibonaci(n -1 ) + fibonaci( n - 2)

    println(fibonaci(8))

    def isPrime ( n: Int) : Boolean = {
      def isPrimeUntil (t : Int) : Boolean =
        if (t <= 1 ) true
        else n % t != 0 && isPrimeUntil(t -1 )

        isPrimeUntil(n/2)
    }

    println(isPrime(37))
    println(isPrime(2332))
    println(isPrime(12*13))

  }

