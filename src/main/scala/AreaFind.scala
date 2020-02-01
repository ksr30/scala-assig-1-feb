object AreaFind extends App {
  def math(firstDimension: Int, secondDimesion: Int, area:(Double, Double) => Double) = area(firstDimension, secondDimesion)

  println("Select Figure of whom you want to find Area")
  println("1. Rectangle")
  println("2. Rhombus")
  println("3. Parallelogram")
  val figureName = scala.io.StdIn.readLine()
  println("Enter First Dimension")
  val firstDimension = scala.io.StdIn.readInt()
  println(("Enter Second Dimension"))
  val secondDimesion = scala.io.StdIn.readInt()
  figureName match {
    case "Rectangle" => println(s"Area of $figureName is " + math(firstDimension, secondDimesion, (firstDimension, secondDimesion) => firstDimension * secondDimesion))
    case "Rhombus" => println(s"Area of $figureName is " + math(firstDimension, secondDimesion, (firstDimension, secondDimesion) => (firstDimension * secondDimesion) / 2))
    case "Parallelogram" => println(s"Area of $figureName is " + math(firstDimension, secondDimesion, (firstDimension, secondDimesion) => firstDimension * secondDimesion))
    case _ => println(s"Not defined yet for $figureName")
  }




}
