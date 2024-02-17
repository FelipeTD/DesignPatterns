import shapesVisitor.*;
import visitor.XMLExportVisitor;

public class VisitorDemo {

    public static void main(String[] args) {
        DotVisitor dot = new DotVisitor(1, 10, 55);
        CircleVisitor circle = new CircleVisitor(2, 23, 15, 10);
        RectangleVisitor rectangle = new RectangleVisitor(3, 10, 17, 20, 30);

        CompoundShapeVisitor compoundShape = new CompoundShapeVisitor(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShapeVisitor c = new CompoundShapeVisitor(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(ShapeVisitor... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }

}
