package lectures.part1Basic

object Expressions extends  App {

  val x = 1 + 2 //expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)


  val aCondiion = true
  val aConditionValue = if (aCondiion) 5 else 3
  println(aConditionValue)

  println (if (aCondiion) 5 else 3)
  println( 1+3)

  var i = 0
  while (i < 10 ) {
    i += 1

    //everything in scaa us ab exoressuion
  }

  val aWeirdValue = (aVariable = 3 ) //unit == void
  println (aWeirdValue)

  //side effect : println(), whiles, reagsiigng
  ///code blocks

  val aCodeBlocks = {

    val y = 2
    val z = y + 1

    if ( z > 2 ) "hello" else "bye"
  }

  //bacisc expressions = operators
  // if in scala is an expressions
  // code blocks in scala are expressions
  //dont use while loops in scala because it'll be your worst nightmare
 }