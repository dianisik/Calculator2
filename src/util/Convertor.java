package util;

public class Convertor {
    public static String arabianToRoman(int arabian) throws Exception {
        int decades = (int) Math.floor(arabian/10); // извлекаем количество целых десятков
        int rest = arabian % 10; // количество единиц
        String prefix;
        switch (decades) {
            case 10: prefix = "C"; break;
            case 9: prefix = "XC"; break;
            case 8: prefix = "LXXX"; break;
            case 7: prefix = "LXX"; break;
            case 6: prefix = "LX"; break;
            case 5: prefix = "L"; break;
            case 4: prefix = "XL"; break;
            case 3: prefix = "XXX"; break;
            case 2: prefix = "XX"; break;
            case 1: prefix = "X"; break;
            case 0: prefix = ""; break;
            default:
                throw new Exception("Не удалось преобразовать число в римский формат.");
        }
        return prefix + romanDigits(rest);
    }

    public static int romanToArabian (String text) throws Exception {
        if (text.equals("I"))  return 1;
        if (text.equals("II"))  return 2;
        if (text.equals("III"))  return 3;
        if (text.equals("IV"))  return 4;
        if (text.equals("V"))  return 5;
        if (text.equals("VI"))  return 6;
        if (text.equals("VII"))  return 7;
        if (text.equals("VIII"))  return 8;
        if (text.equals("IX"))  return 9;
        if (text.equals("X"))  return 10;
        throw new Exception("Не удалось преобразовать число из римского формата в арабский.");
    }

    public static String romanDigits (int digit) throws Exception {
        switch (digit) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            case 0: return "";
            default:
                throw new Exception("Не удалось определить римскую цифру.");
        }
    }
}
