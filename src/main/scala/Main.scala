import Entity.Player

@main def main(): Unit =
  val myPlayer = Player("SuperSoniq")
  myPlayer.printStats()
  myPlayer.x += 10
  myPlayer.y += 24
  println("walk a little bit")
  myPlayer.printStats()