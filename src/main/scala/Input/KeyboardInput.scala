package Input

import java.awt.event.{KeyEvent, KeyListener}

class KeyboardInput extends KeyListener{

  override def keyTyped(e: KeyEvent): Unit = {
  }

  override def keyPressed(e: KeyEvent): Unit = {
    e.getKeyCode match {
      case KeyEvent.VK_W => println("Up pressed")
      case KeyEvent.VK_S => println("Down pressed")
      case KeyEvent.VK_A => println("Left pressed")
      case KeyEvent.VK_D => println("Right pressed")
      case _ => System.out.println("Some other key was pressed")
    }
  }

  override def keyReleased(e: KeyEvent): Unit = {
    e.getKeyCode match {
      case KeyEvent.VK_W => println("Up released")
      case KeyEvent.VK_S => println("Down released")
      case KeyEvent.VK_A => println("Left released")
      case KeyEvent.VK_D => println("Right released")
      case _ => System.out.println("Some other key was released")
    }
  }
}
