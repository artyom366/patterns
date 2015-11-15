package patterns.composite;

/**
 * Created by Artyom on 11/3/2015.
 */
public class Circle implements Shape {

    public void draw(String color) {
        System.out.println("Drawing circle in: " + color);
    }
}
