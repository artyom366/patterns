package multi.wait;

/**
 * Created by artyom on 15.16.12.
 */
public class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (message) {

            System.out.println(Thread.currentThread().getName() + " is done");
            message.notify();
        }
    }
}
