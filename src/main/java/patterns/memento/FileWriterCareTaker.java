package patterns.memento;

/**
 * Created by Artyom on 11/15/2015.
 */
public class FileWriterCareTaker {

    private Object o;

    public void save(FileWriteUtil fileWriteUtil) {
        this.o = fileWriteUtil.save();
    }

    public void undo(FileWriteUtil fileWriteUtil) {
        fileWriteUtil.undoToLastSave(o);
    }
}
