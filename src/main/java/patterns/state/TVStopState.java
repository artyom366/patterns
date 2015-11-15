package patterns.state;

/**
 * Created by Artyom on 11/14/2015.
 */
public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}
