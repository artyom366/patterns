package patterns.interpreter;

/**
 * Created by Artyom on 11/14/2015.
 */
public class ItnToHexExpression implements Expression {

    private int i;

    public ItnToHexExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(this.i);
    }
}
