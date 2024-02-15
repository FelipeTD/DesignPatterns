package mementoEditor;

import commands.Command;
import history.History;
import history.Memento;
import shapes.CompoundShapeMemento;
import shapes.ShapeMemento;

import javax.swing.*;
import java.io.*;
import java.util.Base64;

public class EditorMemento extends JComponent {

    private Canvas canvas;
    private CompoundShapeMemento allShapes = new CompoundShapeMemento();
    private History history;

    public EditorMemento() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(ShapeMemento... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    public CompoundShapeMemento getShapes() {
        return allShapes;
    }

    public void execute(Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo() {
        if (history.undo())
            canvas.repaint();
    }

    public void redo() {
        if (history.redo())
            canvas.repaint();
    }

    public String backup() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.allShapes);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            return "";
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShapes = (CompoundShapeMemento) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
    }

}
