package patterns.interpreter;

/**
 * Created by Artyom on 11/14/2015.
 */
public class InterpreterClient {

    public InterpreterContext interpreterContext;

    public InterpreterClient(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String string) {

        Expression expression = null;
        int i = Integer.parseInt(string.substring(0, string.indexOf(" ")));

        if (string.contains("Hex")) {
            expression = new ItnToHexExpression(i);
        } else if (string.contains("Bin")) {
            expression = new InyToBinaryExpression(i);
        }

        return expression.interpret(interpreterContext);
    }
}
