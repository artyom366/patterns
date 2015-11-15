package patterns.interpreter;

/**
 * Created by Artyom on 11/14/2015.
 */
public class InyToBinaryExpression implements Expression {

    private int i;

    public InyToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(this.i);
    }
}
