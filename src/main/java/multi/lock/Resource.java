package multi.lock;

import multi.local.ThreadLocalEx;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by artyom on 15.16.12.
 */
public class Resource {

    private Lock lock;

    public Resource(Lock lock) {
        this.lock = lock;
    }

    public void print(String threadName) {

        System.out.println("In resource: " + threadName);

        lock.lock();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
