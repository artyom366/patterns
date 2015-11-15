package patterns.proxy;

import java.io.IOException;

/**
 * Created by Artyom on 11/3/2015.
 */
public class CommandExecutorImpl implements CommandExecutor {

    public void runCommand(String command) throws IOException {

        //some heavy implementation
        Runtime.getRuntime().exec(command);
        System.out.println(command + " executed");
    }
}
