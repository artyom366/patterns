package immutable;

/**
 * Created by Artyom on 11/13/2015.
 */


public final class ImmutableClass {

    private final String[] array;

    public ImmutableClass(String[] arr){
        this.array = arr.clone();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Characters in array are: ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }
        return sb.toString();
    }
}

