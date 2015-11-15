package patterns.flyweight;

import java.awt.*;

/**
 * Created by Artyom on 11/4/2015.
 */
public class Line implements Shape{

    public Line() {
        System.out.println("Creating Line object");

        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics line, int x, int y1, int x2, int y2, Color color) {

        line.setColor(color);
        line.drawLine(x, y1, x2, y2);
    }
}
