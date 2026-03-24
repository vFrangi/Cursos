import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxs = new ArrayList<BouncingBox>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxs.add(new BouncingBox(200, 50, Color.RED));
        boxs.add(new BouncingBox(100, 25, Color.GREEN));
        boxs.add(new BouncingBox(150, 100, Color.BLUE));
        boxs.get(0).setMovementVector(1, -5);
        boxs.get(1).setMovementVector(1, 1);
        boxs.get(2).setMovementVector(2, 2);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(20, 20, 80, 40);
        surface.fillRect(50, 150, 30, 20);
        surface.drawString("Prueba", 10, 280);
        for(BouncingBox b : this.boxs)
            b.draw(surface);
    }
} 