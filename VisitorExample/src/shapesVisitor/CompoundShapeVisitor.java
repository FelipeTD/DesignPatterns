package shapesVisitor;

import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShapeVisitor implements ShapeVisitor {

    public int id;
    public List<ShapeVisitor> children = new ArrayList<>();

    public CompoundShapeVisitor(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(ShapeVisitor shape) {
        children.add(shape);
    }

}
