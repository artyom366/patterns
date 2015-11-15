package patterns.proxy;

import java.io.IOException;

/**
 * Created by Artyom on 11/3/2015.
 */
public interface CommandExecutor {

    public void runCommand(String command) throws Exception;
}
