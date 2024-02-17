package shapesVisitor;

import visitor.Visitor;

public class CircleVisitor extends DotVisitor {

    private int radius;

    public CircleVisitor(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }

}
