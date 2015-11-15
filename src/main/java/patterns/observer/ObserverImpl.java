package patterns.observer;

/**
 * Created by Artyom on 11/10/2015.
 */
public class ObserverImpl implements Observer {

    private String name;
    private Subject topic;

    public ObserverImpl(String name) {
        this.name = name;
    }

    public void update() {
        String message = (String)topic.getUpdate(this);

        if(message == null) {
            System.out.println(name + ": No new messages");
        } else {
            System.out.println(name + ": Consuming message: " + message);
        }
    }

    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
