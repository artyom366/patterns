package patterns.mediator;

/**
 * Created by Artyom on 11/10/2015.
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);
    void addUser(User user);
}
