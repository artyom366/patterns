package patterns.composite;

/**
 * Created by Artyom on 11/3/2015.
 */
public class Triangle implements Shape {

    public void draw(String color) {
        System.out.println("Drawing triangle in: " + color);
    }
}
