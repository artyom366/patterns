package multi.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by artyom on 15.16.12.
 */
public class ReentrantLockEx2 implements Runnable {

    private Resource resource;
    private Lock lock;

    public ReentrantLockEx2(Resource resource, Lock lock) {
        this.resource = resource;
        this.lock = lock;
    }

    @Override
    public void run() {

        try {
            if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {

                resource.print(Thread.currentThread().getName());
            } else {

                System.out.println("Resource locked: " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
