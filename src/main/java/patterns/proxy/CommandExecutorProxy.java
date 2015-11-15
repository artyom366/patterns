package patterns.proxy;

import java.io.IOException;

/**
 * Created by Artyom on 11/3/2015.
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutorImpl commandExecutor;

    public CommandExecutorProxy(String user, String password) {
        if ("art".equals(user) && "letmein".equals(password)) {
            isAdmin = true;
            commandExecutor = new CommandExecutorImpl();
        }
    }

    public void runCommand(String command) throws Exception {
        if (isAdmin) {
            commandExecutor.runCommand(command);
        } else {
            if (command.trim().equals("notepad.exe")) {
                throw new Exception("notepad.exe command is not allowed for non admin users.");
            } else {
                commandExecutor.runCommand(command);
            }
        }
    }
}
