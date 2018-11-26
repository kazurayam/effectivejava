package effectivejava.chapter7;

import java.util.function.DoubleBinaryOperator;

public enum OperationByOperator {
    PLUS   ("+", (x, y) -> x + y),
    MINUS  ("-", (x, y) -> x - y),
    TIMES  ("*", (x, y) -> x * y),
    DIVIDE ("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    OperationByOperator(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override public String toString() { return symbol; }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}