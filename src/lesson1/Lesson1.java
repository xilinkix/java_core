package lesson1;

import java.sql.SQLOutput;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("hello world");

        //Примитивы
        //Нравится ли вам кофе
        //true - да
        //false - нет
        boolean answer = false;
        System.out.println("Нравится ли вам кофе?");
        System.out.println(answer);

        //от -128 до 127
        byte bt = -128;

        //БОЛЬШЕ ЗНАЧЕНИЙ -32765 ДО 32767
        short SH = 3200;

        //Диапазон  -2 147 483 648 до 2 147 483 649

        int number = -2_000_000_000;

        //
        long ln = 8_000_000_000L;

        //Числа с плаваюзей точкой
        float fl = 3.1234567f;
        System.out.println(fl);

        double db = 3.12345678901234567890;
        System.out.println(db);

        int number1 = 10;
        int number2 = 2;
        int number3 = 4;
        int result1 = number1 / number2;
        int result2 = number1 + number2;
        int result3 = number1 - number2;
        int result4 = number1 * number2;
        int result5 = number1 / number3;
        System.out.println(result1);

        //Символы
        char ch = 105 + 20000;
        System.out.println(ch);

        int[]   array = new int[5];
        array[0] = 10;
        System.out.println(array[0]);



        char[] arrayChar = new char[5];
        array[0] = 'в';
        array[1] = 'о';
        array[2] = 'д';
        array[3] = 'к';
        array[4] = 'а';
        String vodka = "водка";
        System.out.println(vodka);
        String forChapaev = " для Чапаева";

        //Конкатенация



    }
}

