package patterns.responsibility;

/**
 * Created by Artyom on 11/10/2015.
 */
public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain chain;

    public void setNextChain(DispenseChain nextChain) {
        this.chain.setNextChain(nextChain);
    }

    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount()/10;
            int remainder = currency.getAmount()%10;
            System.out.println("Dispensing " + num + " 10$ note");

            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }
}
