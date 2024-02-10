package commands;

import editor.EditorMemento;
import shapes.ShapeMemento;

import java.awt.*;

public class ColorCommand implements Command {

    private EditorMemento editor;
    private Color color;

    public ColorCommand(EditorMemento editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (ShapeMemento child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }

}
