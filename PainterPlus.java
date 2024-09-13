import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  //ADD MORE METHODS HERE
  //This turns the painter left three times, which is 
  //the same as turning right.
   public void turnRight(){
     turnLeft();
     turnLeft();
     turnLeft();
}

//This takes all of the paint that is in a bucket
  //while the painter is standing on a bucket.
public void takeAllPaint(){
  while (isOnBucket()){
    takePaint();
  }
}
  
//This moves the painter until it cannot move anymore 
//because it is blocked off by something.
public void moveFast(){
   while (canMove()) {
  move();
}
}
//This loops so that while the painter has paint, it paints and then moves.
  //It does this until the painter no longer has paint.
  public void paintToEmpty(String color){
    while (hasPaint()) {
    paint(color);
    move();
  }
  }
//While the painter has paint, it moves the painter,
  //turns it right, paints, moves, then colors again. 
  //Repeating this process makes it into a donut.
  public void paintDonut(String color){
    while (hasPaint()) {
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    }
  }
//While the painter can move, it paints, moves, turns right,
  //moves, paints, and then turns left. This paints a diagonal line.
  public void paintDiagonal(String color) {
while (canMove()) {
paint(color);
move();
turnRight();
move();
paint(color);
turnLeft();
}
}


}