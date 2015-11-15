package patterns.bridge;

/**
 * Created by Artyom on 11/5/2015.
 */
public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color");
        color.applyColor();
    }
}
