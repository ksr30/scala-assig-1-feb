object SumFind extends App{
  def math(sum:(Double, Double) => Double,firstTerm: Int, secondTerm: Int) = sum(firstTerm, secondTerm)
  println("Choose from following options:")
  println("Sum of Squares")
  println("Sum of Cubes")
  println("Sum of Ints")
  val option= scala.io.StdIn.readInt()
  println("First Term")
  val firstTerm=scala.io.StdIn.readInt()
  println("Second Term")
  val secondTerm=scala.io.StdIn.readInt()
  option match{
      case 1 => println(math((firstTerm,secondTerm)=>firstTerm*firstTerm+secondTerm*secondTerm,firstTerm,secondTerm))
      case 2 => println(math((firstTerm,secondTerm)=>firstTerm*firstTerm*firstTerm+secondTerm*secondTerm*secondTerm,firstTerm,secondTerm))
      case 3 => println(math((firstTerm,secondTerm)=>firstTerm+secondTerm,firstTerm,secondTerm))
      case _ => println("Valid option not selected")
  }
}
