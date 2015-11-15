package inter;

/**
 * Created by Artyom on 11/12/2015.
 */
public interface Interface_1 {

    public void print();

    public static void staticPrint() {
        System.out.println("static print from interface_1");
    }

    public default void defaultPrint() {
        System.out.println("default print from interface_1");
    }
}
