package patterns.responsibility;

/**
 * Created by Artyom on 11/10/2015.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
