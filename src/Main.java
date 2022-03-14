import calculator.operations.Operation;

import java.util.Locale;
import java.util.Scanner;
import static util.Parser.parseInput;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.print("Введите арифметическое выражение или \"q\" чтобы выйти: ");
            String toDo = scanner.nextLine().trim().toUpperCase(Locale.ROOT); // считываем выражение
            if(toDo.equals("Q")) break; // выход
            try {
                Operation operation = parseInput(toDo); // создаем операцию
                System.out.println(operation); // выводим на экран
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
