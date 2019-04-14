package lectures.part1Basic

object Recursion extends App{

  def factorial (n: Int) : Int =
    if ( n <= 1 ) 1
    else {
      println ("Computing factorial of" + n + " - First I need factorial of " + (n-1))
      val result = n * factorial (n - 1)
      println( "Computed factorial of " + n )

      result
    }
  println(factorial(10))

  def anotherFactorial ( n: Int) : Int = {
    def factHelper ( x : Int, accumulator: Int ) : Int =
      if (x <= 1) accumulator
      else factHelper( x - 1, x * accumulator)

    factHelper(n,1)
  }
 // def anotherFactorial2 (x : Int) : Int = {
  //  def FactHelper ( )
    //}
}
