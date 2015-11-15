package patterns.template;

/**
 * Created by Artyom on 11/9/2015.
 */
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildPillars() {
        System.out.println("Building glass pillars...");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building glass walls...");
    }
}
