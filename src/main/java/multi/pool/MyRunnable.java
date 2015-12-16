package multi.pool;


/**
 * Created by artyom on 15.16.12.
 */
public class MyRunnable extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " ended");

    }
}
