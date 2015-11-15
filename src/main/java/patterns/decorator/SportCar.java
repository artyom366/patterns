package patterns.decorator;

/**
 * Created by Artyom on 11/9/2015.
 */
public class SportCar extends CarDecorator {

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println(" Adding features of Sports Car.");
    }
}
