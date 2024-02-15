import mementoEditor.EditorMemento;
import shapes.CircleMemento;
import shapes.CompoundShapeMemento;
import shapes.DotMemento;
import shapes.RectangleMemento;

import java.awt.*;

public class MementoMain {

    public static void main(String[] args) {
        EditorMemento editor = new EditorMemento();
        editor.loadShapes(
                new CircleMemento(10, 10, 10, Color.BLUE),

                new CompoundShapeMemento(
                        new CircleMemento(110, 110, 50, Color.RED),
                        new DotMemento(160, 160, Color.RED)
                ),

                new CompoundShapeMemento(
                        new RectangleMemento(250, 250, 100, 100, Color.GREEN),
                        new DotMemento(240, 240, Color.GREEN),
                        new DotMemento(240, 360, Color.GREEN),
                        new DotMemento(360, 360, Color.GREEN),
                        new DotMemento(360, 240, Color.GREEN)
                )
        );
    }

}
