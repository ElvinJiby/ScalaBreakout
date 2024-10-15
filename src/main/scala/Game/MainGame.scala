package Game

class MainGame(
  var gameScreen: GameScreen,
  var gameWindow: GameWindow
) {
  // Game variables
  private var score = 0
  private var lives = 3
  private var numBricks = 50

  def lose_life =
    lives -= 1

  def incrementScore =
    score += 100
}
