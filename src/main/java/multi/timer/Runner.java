package multi.timer;

import java.util.Timer;

/**
 * Created by artyom on 15.16.12.
 */
public class Runner {

    public void run() {

        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(myTask, 0, 10000);

        System.out.println("Task started");

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();
        System.out.println("Task cancelled");
    }
}
