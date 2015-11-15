package enumtype;

import com.sun.xml.internal.ws.Closeable;

import javax.xml.ws.WebServiceException;

/**
 * Created by Artyom on 11/15/2015.
 */
public enum StatesEnum implements Closeable {

    START(1) {
        @Override
        public String getDetails() {
            return "START";
        }
    },
    RUNNING(2) {
        @Override
        public String getDetails() {
            return "RUNNING";
        }
    },
    WAITING(3) {
        @Override
        public String getDetails() {
            return "WAITING";
        }
    },
    DEAD(4) {
        @Override
        public String getDetails() {
            return "DEAD";
        }
    };

    private int priority;

    public abstract String getDetails();

    StatesEnum(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "StatesEnum{priority=" + priority + '}';
    }

    @Override
    public void close() throws WebServiceException {
        System.out.println(this + " closing");
    }
}
