package patterns.command;

/**
 * Created by Artyom on 11/14/2015.
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
