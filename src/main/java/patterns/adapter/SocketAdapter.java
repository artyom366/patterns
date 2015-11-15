package patterns.adapter;

/**
 * Created by Artyom on 11/3/2015.
 */
public interface SocketAdapter {

    public Volt get120Volts();
    public Volt get12Volts();
    public Volt get3Volts();

}
