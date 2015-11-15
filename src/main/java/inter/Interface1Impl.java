package inter;

/**
 * Created by Artyom on 11/12/2015.
 */
public class Interface1Impl implements Interface_1, Interface_2 {

    @Override
    public void print() {
        System.out.println("override print from implementation");
    }

    @Override
    public void defaultPrint() {
        System.out.println("default print from implementation");
    }
}
