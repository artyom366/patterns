package multi.local;


/**
 * Created by artyom on 15.16.12.
 */
public class ThreadLocalEx implements Runnable{

    private ThreadLocal<Integer> threadLocal = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            return 0;
        }
    };

    @Override
    public void run() {

        threadLocal.set((int) (Math.random() * 100));
        System.out.println(Thread.currentThread().getName() + ": " + threadLocal.get());
    }
}
