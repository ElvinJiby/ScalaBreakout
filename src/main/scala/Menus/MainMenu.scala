package Menus

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.*

class MainMenu extends JFrame {
  // Setup for the main menu window
  setTitle("Main Menu")
  setSize(500, 640)
  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
  setResizable(false)
  setFocusable(true)

  private val panel = new JPanel()

  // New Game Button
  private val newGameButton = new JButton("New Game")
  newGameButton.addActionListener((e: ActionEvent) => {
    dispose() // Close the main menu
    //      val gameWindow = new GameWindow("Brick Breaker", 800, 600)
    //      gameWindow.setVisible(true)
  })

  // Credits Button
  private val creditsButton = new JButton("Credits")
  creditsButton.addActionListener((e: ActionEvent) => {
    dispose()
    //      val credits = new CreditsWindow()
    //      credits.setVisible(true)
  })

  // Exit Button
  private val exitButton = new JButton("Exit")
  exitButton.addActionListener((e: ActionEvent) => {
    dispose()
    System.exit(0) // Exit the application
  })

  // Add buttons to panel
  panel.add(newGameButton)
  panel.add(creditsButton)
  panel.add(exitButton)

  add(panel)
  setVisible(true)
}
