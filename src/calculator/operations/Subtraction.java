package calculator.operations;

import calculator.Operand;

public class Subtraction extends Operation {
    public Subtraction(Operand leftOperand, Operand rightOperand) {
        super(leftOperand, rightOperand);
        this.operator = '-';
    }

    @Override
    public int calculate() throws Exception {
        int result = this.leftOperand.getValue() - this.rightOperand.getValue();
        if(this.leftOperand.isRoman() && result < 1) throw new Exception("Для римских чисел недопустимы результаты меньше 1.");
        return result;
    }
}
