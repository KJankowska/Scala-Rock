package lectures.part1Basic

object Values_Variable_Types extends App{

  val x: Int = 10
  println(x)

   //vals are IMMUTABLE

  val aString : String = "just String"
  val anotherString : String = "just another String"

  val sBoolean : Boolean = true
  val aChar : Char  = 'a'
  val anInt : Int = x
  val aShort : Short = 4613
  val aLong : Long = 12345678652132435L
  val aFloat : Float = 2.0f
  val aDouble : Double = 3.14

  //variables

  var aVariable : Int = 4
  aVariable = 5

}
