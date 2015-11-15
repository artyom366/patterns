package patterns.observer;

/**
 * Created by Artyom on 11/10/2015.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject subject);

}
