package multi.callable;

import java.util.concurrent.Callable;

/**
 * Created by artyom on 15.16.12.
 */
public class MyCallable implements Callable<String> {


    @Override
    public String call() throws Exception {

        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }
}
