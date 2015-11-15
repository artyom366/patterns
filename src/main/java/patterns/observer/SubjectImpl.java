package patterns.observer;

import sun.awt.Mutex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artyom on 11/10/2015.
 */
public class SubjectImpl implements Subject {

    public List<Observer> observers;
    private final Object MUTEX = new Object();
    private boolean changed;
    private String message;

    public SubjectImpl() {
        this.observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("the observer is null");
        }

        synchronized (MUTEX) {
            if (!observers.contains(observer)) {
                observers.add(observer);
            }
        }
    }

    public void unRegister(Observer observer) {
        synchronized (MUTEX) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        List<Observer> observersLocal = null;

        synchronized (MUTEX) {
            if (!changed) {
                return;
            }

            observersLocal = new ArrayList<Observer>(this.observers);
            this.changed = false;

            for (Observer observer : observersLocal) {
                observer.update();
            }
        }
    }

    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to Topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
