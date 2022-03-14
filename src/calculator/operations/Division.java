package calculator.operations;

import calculator.Operand;

public class Division extends Operation {
    public Division(Operand leftOperand, Operand rightOperand) {
        super(leftOperand, rightOperand);
        this.operator = '/';
    }

    @Override
    public int calculate() throws Exception {
        int result = (int) Math.floor(this.leftOperand.getValue() / this.rightOperand.getValue());
        if(this.leftOperand.isRoman() && result < 1) throw new Exception("Для римских чисел недопустимы результаты меньше 1.");
        return result;
    }
}
