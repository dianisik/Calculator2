package calculator.operations;

import calculator.Operand;

public class Multiplication extends Operation {
    public Multiplication(Operand leftOperand, Operand rightOperand) {
        super(leftOperand, rightOperand);
        this.operator = '*';
    }

    @Override
    public int calculate() {
        return this.leftOperand.getValue() * this.rightOperand.getValue();
    }
}
