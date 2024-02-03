import editor.ImageEditor;
import shapes.CompositeCircle;
import shapes.CompositeRectangle;
import shapes.CompoundShape;
import shapes.Dot;

import java.awt.*;

public class CompositeMain {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new CompositeCircle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new CompositeCircle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new CompositeRectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }

}
