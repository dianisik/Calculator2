package calculator;

import util.Convertor;

import java.util.Locale;

public class Operand {

    private int value;
    private String text;
    private boolean _isRoman = false;

    public Operand(String value) throws Exception {
        this.text = value.trim(); // избавляемся от пробелов
        try {
            this.value = Integer.parseInt(this.text); // преобразование строки в число
            if (this.value < 1) throw new Exception("Числа меньше 1 не обрабатываются.");
            if (this.value > 10) throw new Exception("Числа больше 10 не обрабатываются.");
        }
        catch (NumberFormatException ex) { // не удалось превратить строку в число стандартным способом
            _isRoman = true;
            this.value = Convertor.romanToArabian(text);
        }
    }

    public boolean isRoman () {
        return _isRoman;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
