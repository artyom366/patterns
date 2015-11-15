package patterns.observer;


/**
 * Created by Artyom on 11/10/2015.
 */
public interface Subject {

    //methods to register and unregister observers
    public void register(Observer observer);
    public void unRegister(Observer observer);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Observer observer);
}
