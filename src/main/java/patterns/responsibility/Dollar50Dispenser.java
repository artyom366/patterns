package patterns.responsibility;

/**
 * Created by Artyom on 11/10/2015.
 */
public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount()%50;
            System.out.println("Dispensing " + num + " 50$ note");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
