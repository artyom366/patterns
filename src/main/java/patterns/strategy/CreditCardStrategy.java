package patterns.strategy;

/**
 * Created by Artyom on 11/12/2015.
 */
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String number;
    private String cvv;
    private String expiration;

    public CreditCardStrategy(String name, String number, String cvv, String expiration) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.expiration = expiration;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}
