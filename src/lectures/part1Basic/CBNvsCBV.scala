package lectures.part1Basic

object CBNvsCBV extends App{

  def callByValue(x : Long): Unit = {
    println( "by value : " + x)
    println( "by value : " + x)

  }

  def calledByName ( x : => Long) : Unit = {

    println( "by value : " + x)
    println( "by value : " + x)

  }

  callByValue(System.nanoTime())
  calledByName(System.nanoTime())

}
