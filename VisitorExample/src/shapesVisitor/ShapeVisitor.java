package shapesVisitor;

import visitor.Visitor;

public interface ShapeVisitor {

    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);

}
