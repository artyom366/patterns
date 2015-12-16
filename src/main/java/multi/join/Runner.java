package multi.join;

/**
 * Created by artyom on 15.16.12.
 */
public class Runner {



    public void run() {

        Thread thread1 = new Thread(new MyRunnable(), "thread1");
        Thread thread2 = new Thread(new MyRunnable(), "thread2");
        Thread thread3 = new Thread(new MyRunnable(), "thread3");


        thread1.start();

        try {
            thread1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finish");
    }
}
