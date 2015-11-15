package patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artyom on 11/3/2015.
 */
public class Drawing implements Shape {

    //collection of Shapes
    private List<Shape> shapes = new ArrayList<Shape>();

    public void draw(String color) {

        for (Shape shape : shapes) {
            shape.draw(color);
        }
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void clearShapes() {
        this.shapes.clear();
    }
}
