package visitor;

import shapesVisitor.CircleVisitor;
import shapesVisitor.CompoundShapeVisitor;
import shapesVisitor.DotVisitor;
import shapesVisitor.RectangleVisitor;

public interface Visitor {

    String visitDot(DotVisitor dot);

    String visitCircle(CircleVisitor circle);

    String visitRectangle(RectangleVisitor rectangle);

    String visitCompoundGraphic(CompoundShapeVisitor cg);

}
