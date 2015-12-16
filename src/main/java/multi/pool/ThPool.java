package multi.pool;

import java.util.concurrent.*;

/**
 * Created by artyom on 15.16.12.
 */
public class ThPool {

    public void runFixed() {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {

            MyRunnable r = new MyRunnable();
            service.execute(r);
        }

        service.shutdown();

        while (!service.isTerminated()) {
            System.out.println("service is processing");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished");
    }

    public void runCached() {

        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {

            MyRunnable r = new MyRunnable();
            service.execute(r);
        }

        service.shutdown();

        while (!service.isTerminated()) {
            System.out.println("service is processing");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished");
    }


    public void runScheduled() {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);

        for (int i = 0; i < 20; i++) {

            MyRunnable r = new MyRunnable();
            service.schedule(r, 2, TimeUnit.SECONDS);
        }

        service.shutdown();

        while (!service.isTerminated()) {
            System.out.println("service is processing");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finished");
    }




}
