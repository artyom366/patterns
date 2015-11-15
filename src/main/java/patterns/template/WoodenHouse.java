package patterns.template;

/**
 * Created by Artyom on 11/9/2015.
 */
public class WoodenHouse extends HouseTemplate {


    @Override
    public void buildPillars() {
        System.out.println("Building wooden pillars...");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls...");
    }
}
