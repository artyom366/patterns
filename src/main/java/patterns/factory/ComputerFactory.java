package patterns.factory;

/**
 * Created by Artyom on 11/2/2015.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {

        if (type.equalsIgnoreCase("PC")) {
            return new PC(ram, hdd, cpu);

        } else if (type.equalsIgnoreCase("SERVER")) {
            return new Server(ram, hdd, cpu);
        }

        return null;
    }
}
