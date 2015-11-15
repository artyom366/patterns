package patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artyom on 11/10/2015.
 */
public class ChatMediatorImpl implements ChatMediator {

    public List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<User>();
    }

    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
