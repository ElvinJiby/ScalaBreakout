package Data

class Coordinate (
  private var x: Float,
  private var y: Float
):
  // Default constructor
  def this() = this(0,0)

  // Print position
  def printPos(): Unit =
    println(s"($x,$y)")

end Coordinate
