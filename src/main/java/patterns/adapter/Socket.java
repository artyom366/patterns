package patterns.adapter;

/**
 * Created by Artyom on 11/3/2015.
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
