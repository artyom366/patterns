package patterns.adapter;

/**
 * Created by Artyom on 11/3/2015.
 */
public class SocketAdapterImpl extends Socket implements SocketAdapter {

    public Volt get120Volts() {
        return getVolt();
    }

    public Volt get12Volts() {
        return voltConversion(getVolt(), 10);
    }

    public Volt get3Volts() {
        return voltConversion(getVolt(), 40);
    }

    public Volt voltConversion(Volt volt, int divider) {
        return new Volt(volt.getVolts() / divider);
    }
}
