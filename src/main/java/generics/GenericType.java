package generics;

/**
 * Created by Artyom on 11/11/2015.
 */
public  class GenericType<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <T> boolean isEqual(T t1, T t2) {
        return t1.equals(t2);
    }
}
