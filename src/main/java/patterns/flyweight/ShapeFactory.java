package patterns.flyweight;

import java.util.HashMap;

/**
 * Created by Artyom on 11/4/2015.
 */
public class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static enum ShapeType {
        OVAL_FILL,
        OVAL_NOFILL,
        LINE;
    }

    public static Shape getShape(ShapeType shapeType) {

        Shape shape = shapes.get(shapeType);

        if (shape == null) {
            if (shapeType.equals(ShapeType.OVAL_FILL)) shape = new Oval(true);
            else if (shapeType.equals(ShapeType.OVAL_NOFILL)) shape = new Oval(false);
            else if (shapeType.equals(ShapeType.LINE)) shape = new Line();

            shapes.put(shapeType, shape);
        }

        return shape;
    }
}


