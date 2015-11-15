package patterns.flyweight;

import java.awt.*;

/**
 * Created by Artyom on 11/4/2015.
 */
public interface Shape {

    public void draw(Graphics graphics, int x, int y, int width, int height, Color color);
}
