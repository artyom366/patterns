package multi.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by artyom on 15.16.12.
 */
public class Runner {

    public void run () {

        List<Future<String>> futures = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(5);

        MyCallable callable = new MyCallable();

        for (int i = 0; i < 10; i++) {

            Future<String> future = service.submit(callable);
            futures.add(future);
        }

        for (Future<String> future : futures) {

            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        service.shutdown();
    }
}
