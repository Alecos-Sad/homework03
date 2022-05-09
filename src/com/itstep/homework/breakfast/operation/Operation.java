package com.itstep.homework.breakfast.operation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operation {

    /**
     * Класс для решения задач 13 - 30 из Homework03
     *
     * @author SadovNick
     */

    public static int bracketCount(String str) {
        // метод считает количество "(" и ")" в строке
        int count = 0;
        char firstBracket = ')';
        char secondBracket = '(';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == firstBracket || str.charAt(i) == secondBracket) {
                count++;
            }
        }
        return count;
    }

    public static String retBetweenBrackets(String str) {
        //метод возвращает строку между " ( ) "
        char firstBracket = ')';
        char secondBracket = '(';
        str = str.substring(str.indexOf(secondBracket) + 1, str.indexOf(firstBracket));
        return str;
    }

    public static double RetFirstNumber() {
        //метод возвращает первое число из строки "1.23+4.56"
        String str = "1.23+4.56";
        str = str.substring(0, str.indexOf("+"));
        return Double.parseDouble(str);
    }

    public static double RetSecondNumber() {
        //метод возвращает второе число из строки "1.23+4.56"
        String str = "1.23+4.56";
        str = str.substring(str.indexOf("+") + 1);
        return Double.parseDouble(str);
    }

    public static BigDecimal addRetNumbers() {
        //метод слаживает возращенные значения RetFirstNumber() и RetSecondNumber()
        BigDecimal result = BigDecimal.valueOf(RetFirstNumber() + RetSecondNumber());
        result = result.setScale(2, RoundingMode.UP);
        return result;
    }

    public static String removeDuplicates(String str) {
        //метод удаляет все дубликаты символов в строке но порядок не затрагивает
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!result.toString().contains(String.valueOf(str.charAt(i)))) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static String removeDigit(String str) {
        //метод удаляет из строки все лишние символы кроме чисел
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean isCheckNumber(String str) {
        //метод проверяет, является ли содержимое строки числом
        StringBuilder result = new StringBuilder();
        int start = 0;
        if (str.trim().startsWith("-")) {
            result.append(str.charAt(0));
            start = 1;
        }
        for (int i = start; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9' || str.charAt(i) == '.') {
                result.append(str.charAt(i));
            }
        }
        return result.toString().indexOf('.') == result.toString().lastIndexOf('.') &&
                str.length() == result.length();
    }

    public static boolean isBracketsCorrect(String str) {
        //метод проверяет чтобы строка не начиналась на закрывающую скобку ')'
        // и чтобы строка не заканчивалась на открывающую скобку '('
        return !str.trim().startsWith(")") &&
                !str.trim().endsWith("(");
    }

    private static boolean mIsCorrectRightBracket(String str) {
        //метод проверяет наличие "(" в строке
        return str.trim().contains("(");
    }

    private static boolean mIsCorrectLeftBracket(String str) {
        //метод проверяет наличие ")" в строке
        return str.trim().contains(")");
    }

    public static boolean isHasBrackets(String str) {
        //метод принимает строку и возвращать результат работы предыдущих двух методов
        return mIsCorrectLeftBracket(str) && mIsCorrectRightBracket(str);
    }

    public static boolean isHasBracketsInvert(String str) {
        //инвертированный вариант isHasBrackets
        return !mIsCorrectLeftBracket(str) && !mIsCorrectRightBracket(str);
    }

    public static String replaceStrUniv(String str) {
        //метод заменяет в строке умножение 2-х чисел на готовый результат
        String fin;

        double d1 = Double.parseDouble(str.substring(str.indexOf("+") + 1, str.lastIndexOf("*")));
        double d2 = Double.parseDouble(str.substring(str.indexOf("*") + 1, str.lastIndexOf("+")));


        if (String.valueOf(d1).contains(".")) {
            fin = str.substring(0, str.indexOf("+") + 1) + ((d1 * d2)) + str.substring(str.lastIndexOf("+"));
        } else {
            fin = str.substring(0, str.indexOf("+") + 1) + ((int) (d1 * d2)) + str.substring(str.lastIndexOf("+"));
        }
        return fin;
    }

    public static String equationInsideBrackets(String str) {
        //метод находит в строке скобки и решает уравнение внутри них

        String result;
        char operation = 0;

        String str2 = Operation.retBetweenBrackets(str);

        String[] splitstr = str2.split("[+-/*]");

        String firstNum = splitstr[0];
        String secondNum = splitstr[1];

        operation = mGetOperation(str2, operation);
        result = Operation.mOperationNumberFromString(firstNum, secondNum, operation);

        return result;
    }

    private static String mOperationNumberFromString(String first, String second, char operation) {
        //метод принимает значения с equationInsideBrackets и возвращает результат вычисления
        int firstNum = Integer.parseInt(first);

        int secondNum = Integer.parseInt(second);
        int result = 0;

        switch (operation) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            default:
                System.out.println("Only integer non-zero parameters allowed");
        }
        return first + " " + operation + " " + second + " = " + result;
    }

    public static String numLeftSymbol(String str) {
        //метод находит в строке первое число левее математического символа, чья координата известна
        int indexPlus = str.indexOf(getMathSymbol(str));
        str = str.substring(0, indexPlus);
        return isCheckNumber(str) ? str : null;
    }

    public static String numRightSymbol(String str) {
        //метод находит в строке первое число левее математического символа, чья координата известна
        int indexPlus = str.indexOf(getMathSymbol(str));
        str = str.substring(indexPlus + 1);
        return isCheckNumber(str) ? str : null;
    }

    public static char getMathSymbol(String str) {
        //метод возвращает математический символ
        String result;
        char operation = 0;
        String[] splitstr = str.split("[+-/*]");
        operation = mGetOperation(str, operation);
        return operation;
    }

    private static char mGetOperation(String str, char operation) {
        //метод ищет математический символ в строке
        char[] ch = new char[20];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (ch[i] == '+') {
                operation = '+';
            }
            if (ch[i] == '-') {
                operation = '-';
            }
            if (ch[i] == '*') {
                operation = '*';
            }
            if (ch[i] == '/') {
                operation = '/';
            }
        }
        return operation;
    }


}

