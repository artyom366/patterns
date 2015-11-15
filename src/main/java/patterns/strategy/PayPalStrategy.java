package patterns.strategy;

/**
 * Created by Artyom on 11/12/2015.
 */
public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal");
    }
}
