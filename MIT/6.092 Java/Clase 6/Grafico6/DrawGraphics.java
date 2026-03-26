import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movingSprite = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {

        Rectangle box = new Rectangle(15, 20, Color.RED);
        Line linea = new Line(5, 3, Color.BLUE);

        movingSprite.add(new Bouncer(100, 170, box));
        movingSprite.get(0).setMovementVector(3, 1);
        movingSprite.add(new Bouncer(130, 200, linea));
        movingSprite.get(1).setMovementVector(3, 1);

        movingSprite.add(new StraightMover(50, 70, box));
        movingSprite.get(2).setMovementVector(3, 1);
        movingSprite.add(new StraightMover(30, 50, linea));
        movingSprite.get(3).setMovementVector(3, 1);

    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for(Mover m : movingSprite)
            m.draw(surface);
    }
}
