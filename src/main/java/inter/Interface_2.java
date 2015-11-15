package inter;

/**
 * Created by Artyom on 11/12/2015.
 */
public interface Interface_2 {

    void print();

    static void staticPrint() {
        System.out.println("static print from interface_2");
    }

    default void defaultPrint() {
        System.out.println("default print from interface_2");
    }

}
