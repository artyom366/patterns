package multi.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by artyom on 15.16.12.
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Started at: " + new Date());
        task();
        System.out.println("Finished at: " + new Date());
    }

    private void task() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
