package Entity

import Data.Coordinate

class Player(
  var x: Float,
  var y: Float,
  var username: String = "GamerKnight999"
) extends Coordinate(x,y):

  // Constructor
  def this(username: String) = this(0,0,username)

  // Print player information
  def printStats(): Unit =
    println(s"$username is at ($x,$y)")

end Player


