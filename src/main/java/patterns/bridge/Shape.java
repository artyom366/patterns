package patterns.bridge;

/**
 * Created by Artyom on 11/5/2015.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
