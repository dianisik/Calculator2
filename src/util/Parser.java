package util;

import calculator.Operand;
import calculator.operations.*;

public class Parser {

    public static Operation parseInput(String toDo) throws Exception {
        for (int i = 0; i < toDo.length(); i++) {
            char ch = toDo.charAt(i);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                return getOperation(toDo, ch, i);
            }
        }
        throw new Exception("Не удалось распознать оператор."); // если ни один из 4 символов не найден
    }
        private static Operation getOperation (String toDo,char operator, int operatorIndex) throws Exception {
            String leftPart = toDo.substring(0, operatorIndex);
            String rightPart = toDo.substring(operatorIndex + 1);
            Operand leftOperand = new Operand(leftPart);
            Operand rightOperand = new Operand(rightPart);
            if (leftOperand.isRoman() != rightOperand.isRoman()) throw new Exception("Не совпадают кодировки чисел.");

            return switch (operator) {
                case '+' -> new Addition(leftOperand, rightOperand);
                case '-' -> new Subtraction(leftOperand, rightOperand);
                case '*' -> new Multiplication(leftOperand, rightOperand);
                default -> new Division(leftOperand, rightOperand);
            };
        }
    }

