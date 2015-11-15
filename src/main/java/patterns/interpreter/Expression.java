package patterns.interpreter;

/**
 * Created by Artyom on 11/14/2015.
 */
public interface Expression {

    String interpret(InterpreterContext interpreterContext);
}
