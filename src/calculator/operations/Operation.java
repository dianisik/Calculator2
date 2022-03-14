package calculator.operations;

import calculator.Operand;

import static util.Convertor.*;

public abstract class Operation {

    protected Operand leftOperand, rightOperand;
    protected char operator;

    public Operation(Operand leftPart, Operand rightPart) {
        this.leftOperand = leftPart;
        this.rightOperand = rightPart;
    }

    public abstract int calculate() throws Exception;

    @Override
    public String toString() {
        boolean isRoman = leftOperand.isRoman();

        try {
            int result = this.calculate();
            return isRoman ? arabianToRoman(result) : String.valueOf(result);
        } catch (Exception e) {

            return e.getMessage();
        }
    }
}
