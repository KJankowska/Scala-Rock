package lectures.part1Basic

object DefaultArgs extends App{

  def trFact (n : Int, acc: Int) : Int =
    if (n <= 1)acc
    else trFact(n - 1, n*acc)

  val fact10 = trFact(10,1)

}
