object Fibonacci extends App {
  def feb(firstTerm: Array[Int], secondTerm: Array[Int], limit: Int): Unit = {
    val thirdTerm = Array(0)
    if (limit > 0) {
      thirdTerm(0) = firstTerm(0) + secondTerm(0)
      println(thirdTerm(0))
      firstTerm(0) = secondTerm(0)
      secondTerm(0) = thirdTerm(0)
      feb(firstTerm, secondTerm, limit - 2)
    }
  }

  val firstTerm = Array(0)
  val secondTerm = Array(1)
  println("Enter Limit")
  val limit = scala.io.StdIn.readInt()
  println("1")
  println("2")

  feb(firstTerm, secondTerm, limit - 1)
}

