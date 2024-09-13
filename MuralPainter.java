import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class MuralPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (canMove()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
    paint(color);
  }

  //While the spaces are more than zero, paint, and move, and 
  //subtract the spaces by one each time. This is like a paintLine
  //but for this specific grid.
  public void paintRow(String color, int spaces) {
    while (spaces > 0) {
      paint(color);
      move();
      spaces--;
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the MuralPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the MuralPainter to the bottom right corner
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }

  //This paints twice and turns right three times in total, but 
  //paints one extra. This is used to create a square, like the 
  //ones seen on Kuromi's ears.
  public void paintSquare(String color) {
  paintRow(color, 2);
   turnRight();
   paintRow(color, 2);
    turnRight();
   paintRow(color, 2);
    turnRight();
    paintRow(color, 2);
  }

  //This moves, turns left, and moves again.
  //I created this so that it is easier to keep
  //track of code and it doesn't look like a lot.
  public void moveLeft() {
    move();
    turnLeft();
    move();
  }

  //This moves, turns right, and moves again.
  //As stated before, this was made so that
  //I wouldn't have to type it all out every time.
  public void moveRight() {
    move();
    turnRight();
    move();
  }
}