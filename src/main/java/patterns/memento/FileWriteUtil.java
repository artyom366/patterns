package patterns.memento;

/**
 * Created by Artyom on 11/15/2015.
 */
public class FileWriteUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriteUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String string) {
        content.append(string);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Object o) {
        Memento memento = (Memento) o;
        this.fileName = memento.filenameM;
        this.content = memento.contentM;
    }

    private class Memento {

        private String filenameM;
        private StringBuilder contentM;

        public Memento(String filenameM, StringBuilder contentM) {
            this.filenameM = filenameM;
            this.contentM = new StringBuilder(contentM);
        }
    }
}
