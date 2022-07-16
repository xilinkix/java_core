package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Домашка №1
 */
public class Homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        world = world.toLowerCase();
        String hiWorld = hi.trim() + world + newLine;
        System.out.println("Базовый уровень: задача №1 " + '\n' +'\n' + hiWorld.repeat(3));
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже) используя String.trim()
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!


        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        float growth = 1.71F;
        int massa = 73;
        float imt = massa / (growth * growth);
        System.out.println("Базовый уровень: задача №2" + '\n');
        System.out.println("Ваш индекс массы тела равен " + imt + '\n');




        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche
        System.out.println("Базовый уровень: задача №3" + '\n');
        char[] newArray = new char[]{'a', 'b', 'c', 'd', 'e'};
        System.out.println(newArray);
        newArray[3] = 'h';
        System.out.println(newArray);
        System.out.print('\n');



        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

        String text = "234";
        int aa = Integer.parseInt(text);
        String text2 = "some_text";
        int bb = text2.length();
        int cc = aa + bb;
        System.out.println("Продвинутый уровень: задача №1 " + '\n' + '\n' + cc);
        System.out.print('\n');

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        double a = 3;
        double b = 5;
        double c = Math.sqrt(a + b);
        System.out.println("Продвинутый уровень: задача №2" + '\n' + '\n' + "a=3, b=5" + '\n' + "(a + b)^2 = " + c);

        //Задача №3
        //Создать два массива чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] ar1 = new int[] {1,2,5,7,10};
        int[] ar2 = new int[] {2,3,2,17,15};
        int[] ar3 = new int [ar1.length + ar2.length * 2];
        int count = 0;
        for (int i = 0; i < ar1.length; i++ ) {
            ar3[i] = ar1[i];
            count++;
        }
        for (int i = 0; i < ar2.length; i++ ) {
            ar3[count++] = ar2[i];
        }
        for (int i = 0; i < ar1.length; i++) {
            ar3[count++] = ar2[i] * ar1[i];

        }

        System.out.println(Arrays.toString(ar3));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        System.out.println("Продвинутый уровень: задача №4" + '\n');
        String str = "Hello world!";
        String subStr = str.substring(0, 8);
        System.out.println(subStr.replace('l', 'r').toUpperCase());






        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}