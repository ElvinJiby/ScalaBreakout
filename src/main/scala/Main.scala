import Game.*
import Menus.MainMenu

object Main extends App {
  try
    val gameScreen = GameScreen()
    val gameWindow = GameWindow()
    val game = MainGame(gameScreen, gameWindow)
  catch
    case e: Exception =>
      println(e.getMessage)
}
