package shapes;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShapeMemento extends BaseShapeMemento {

    private List<ShapeMemento> children = new ArrayList<>();

    public CompoundShapeMemento(ShapeMemento... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(ShapeMemento component) {
        children.add(component);
    }

    public void add(ShapeMemento... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(ShapeMemento child) {
        children.remove(child);
    }

    public void remove(ShapeMemento... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        if (children.size() == 0) {
            return 0;
        }
        int x = children.get(0).getX();
        for (ShapeMemento child : children) {
            if (child.getX() < x) {
                x = child.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (children.size() == 0) {
            return 0;
        }
        int y = children.get(0).getY();
        for (ShapeMemento child : children) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (ShapeMemento child : children) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (ShapeMemento child : children) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void drag() {
        for (ShapeMemento child : children) {
            child.drag();
        }
    }

    @Override
    public void drop() {
        for (ShapeMemento child : children) {
            child.drop();
        }
    }

    @Override
    public void moveTo(int x, int y) {
        for (ShapeMemento child : children) {
            child.moveTo(x, y);
        }
    }

    @Override
    public void moveBy(int x, int y) {
        for (ShapeMemento child : children) {
            child.moveBy(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (ShapeMemento child : children) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
        for (ShapeMemento child : children) {
            child.setColor(color);
        }
    }

    @Override
    public void unSelect() {
        super.unSelect();
        for (ShapeMemento child : children) {
            child.unSelect();
        }
    }

    public ShapeMemento getChildAt(int x, int y) {
        for (ShapeMemento child : children) {
            if (child.isInsideBounds(x, y)) {
                return child;
            }
        }
        return null;
    }

    public boolean selectChildAt(int x, int y) {
        ShapeMemento child = getChildAt(x,y);
        if (child != null) {
            child.select();
            return true;
        }
        return false;
    }

    public List<ShapeMemento> getSelected() {
        List<ShapeMemento> selected = new ArrayList<>();
        for (ShapeMemento child : children) {
            if (child.isSelected()) {
                selected.add(child);
            }
        }
        return selected;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (ShapeMemento child : children) {
            child.paint(graphics);
        }
    }

}
