package calculator.operations;

import calculator.Operand;

public class Addition extends Operation {
    public Addition(Operand leftOperand, Operand rightOperand) {
        super(leftOperand, rightOperand);

    }

    @Override
    public int calculate() {
        return this.leftOperand.getValue() + this.rightOperand.getValue();
    }
}
