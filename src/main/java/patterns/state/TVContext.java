package patterns.state;

/**
 * Created by Artyom on 11/14/2015.
 */
public class TVContext implements State {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
