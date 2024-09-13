import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //This creates a painter from the MuralPainter subclass
MuralPainter angie = new MuralPainter();

    //This creates a painter from the AsphaltPainter subclass
    AsphaltPainter layla = new AsphaltPainter();

    //This paints the background, which is a light blue on a 32 grid.
   angie.paintBackground("lightBlue", 32);

  //This paints all parts of Kuromi.
    layla.paintKuromi();
    
  }
}