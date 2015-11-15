package patterns.template;

/**
 * Created by Artyom on 11/9/2015.
 */
public abstract class HouseTemplate {

    public final void build() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
    }

    private void buildWindows() {
        System.out.println("Building windows...");
    }

    public abstract void buildPillars();
    public abstract void buildWalls();

    private void buildFoundation() {
        System.out.println("Building foundation...");
    }
}
