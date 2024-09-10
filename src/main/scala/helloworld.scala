@main def main(): Unit =
  println("Hello World")
  printmsg("Pingas ;)")

def printmsg(msg: String): Unit =
  println(s"This was your message:\n$msg")