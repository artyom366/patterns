package patterns.bridge;


/**
 * Created by Artyom on 11/5/2015.
 */
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color");
        color.applyColor();
    }
}
