package patterns.command;

/**
 * Created by Artyom on 11/14/2015.
 */
public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {

        String osName = System.getProperty("os.name");
        System.out.println("Underlying File System: " + osName);

        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
