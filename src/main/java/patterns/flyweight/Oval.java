package patterns.flyweight;

import java.awt.*;

/**
 * Created by Artyom on 11/4/2015.
 */
public class Oval implements Shape {

    private boolean fill;

    public Oval(boolean fill) {

        this.fill = fill;
        System.out.println("Creating Oval object with fill: " + fill);

        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {

        circle.setColor(color);
        circle.drawOval(x, y, width, height);

        if (this.fill) {
            circle.fillOval(x, y, width, height);
        }
    }
}
