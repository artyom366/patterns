package patterns.command;

/**
 * Created by Artyom on 11/14/2015.
 */
public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
