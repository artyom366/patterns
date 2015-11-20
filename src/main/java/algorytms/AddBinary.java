package algorytms;

/**
 * Created by artyom on 15.20.11.
 */
public class AddBinary {

    public static String addBinary(String a, String b) {

        int aDecimal = Integer.parseInt(a, 2);
        int bDecimal = Integer.parseInt(b, 2);

        int result = aDecimal + bDecimal;

        return Integer.toString(result, 2);
    }
}
