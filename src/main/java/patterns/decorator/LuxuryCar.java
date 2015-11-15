package patterns.decorator;

/**
 * Created by Artyom on 11/9/2015.
 */
public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println(" Adding features of Luxury Car.");
    }
}
