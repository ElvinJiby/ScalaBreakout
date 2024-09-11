import Menus.MainMenu

object Main extends App {
  try
    val game = MainMenu()
  catch
    case e: Exception =>
      println(e.getMessage)
}
