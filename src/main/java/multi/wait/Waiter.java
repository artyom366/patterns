package multi.wait;


/**
 * Created by artyom on 15.16.12.
 */
public class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        synchronized (message) {

            try {
                System.out.println(Thread.currentThread().getName() + " is waiting");
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " is notified");
            System.out.println(Thread.currentThread().getName() + " is processed");
        }
    }
}
