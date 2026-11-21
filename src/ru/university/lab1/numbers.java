package ru.university.lab1;

public class numbers {
    public static void run() {
        char a = 'A';
        char b = 'B';
        charOperations(a, b);
    }

    //----------------------------------
    //Целочисленные ловушки
    //1.1
    private static void maxMinValue(){
        System.out.println("Max значение byte: " + Byte.MAX_VALUE);
        System.out.println("Min значение byte: " + Byte.MIN_VALUE);
        System.out.println("Max значение short: " + Short.MAX_VALUE);
        System.out.println("Max значение short: " + Short.MIN_VALUE);
        System.out.println("Max значение int: " + Integer.MAX_VALUE);
        System.out.println("Max значение int: " + Integer.MIN_VALUE);
        System.out.println("Max значение long: " + Long.MAX_VALUE);
        System.out.println("Max значение long: " + Long.MIN_VALUE);
    }
    //1.2
    private static void intPlus1() {
        System.out.println(Integer.MAX_VALUE + 1);
    }
    //1.3
    private static void typesDif() {
        int num1 = Integer.MAX_VALUE * 2;
        long num2 = Integer.MAX_VALUE * 2L;
        System.out.println("В int: " + num1);
        System.out.println("В long: " + num2);
        /*Тк на long выделено больше памяти, максимальное число
        * больше, поэтому при +1 значения разные*/
    }
    //1.4
    private static void balances() {
        System.out.println("5 / 2 = " + (5 / 2));
        System.out.println("-5 / 2 = " + (-5 / 2));
        System.out.println("5 % 2 = " + (5 % 2));
        System.out.println("-5 % 2 = " + (-5 % 2));
        /*Знак остатка совпадает со знаком первого числа,
        * то есть делимого, в нашем случае -5,
        * значит значение отрицательное*/
    }
    //1.5
    private static void longToInt() {
        long num = Integer.MAX_VALUE + 1L;
        System.out.println("Значение числа в long: " + num);
        System.out.println("Перевод long в int: " + (int) num);
        /*тк будет переполнение, число больше,
        *его старший бит будет = 1 (то есть 31 бит),
        *1 означает отрицательное число */
    }
    //1.6
    private static void charOperations(char letter1, char letter2) {
        System.out.println("Следующая буква: " + (char) (letter1 + 1));
        System.out.println("В виде числа: " + (letter1 + 1));
        System.out.println("Сумма двух символов: " + (char) (letter1 + letter2));
        System.out.println("В виде числа: " + (letter1 + letter2));
    }
    //1.7
    private static void overflowedCheck(int num1, int num2) {
        int num3 = Integer.MAX_VALUE;

        int num12 = num1 + num2;
        int num13 = num1 + num3;

        boolean firstPair = (num1 > 0 && num2 > 0 && num12 < 0) || (num1 < 0 && num2 < 0 && num12 > 0);
        boolean secondPair = (num1 > 0 && num3 > 0 && num13 < 0) || (num1 < 0 && num3 < 0 && num13 > 0);
        System.out.print("Первая пара: ");
        if(firstPair) {
            System.out.println("переполнение!!!");
        } else {
            System.out.println("все хорошо");
        }
        System.out.print("Вторая пара: ");
        if(secondPair) {
            System.out.println("переполнение!!!");
        } else {
            System.out.println("все хорошо");
        }
    }

    //-------------------------------------------
    //Вещественная арифметика
    //2.1
    private static void summa() {
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));
        /*т.к. в двоичной системе счисления
        0.1 и 0.2 - бесконечные дроби, при переводе
        в тип double получается неточность */
    }
    //2.2
    private static void cycleAndResult() {
        double fromCycle = 0.0;
        for (int i = 1; i <= 10; i++) {
            fromCycle += 0.1;
        }

        System.out.println("Число из цикла: " + fromCycle);
        System.out.println(fromCycle == 1.0);
    }
    //2.3
    private static boolean comparisonDouble(double num1, double num2, double eps) {
            return Math.abs(num1 - num2) < eps;
    }
    //2.4
    private static void getInfinity(double posNum, double negNum){
        System.out.println("Infinity: " + (posNum / 0));
        System.out.println("-Infinity: " + (negNum / 0));
        //NaN1
        System.out.println(0.0 / 0.0);
        //NaN2
        System.out.println((negNum / 0) * 0);
    }
    //2.5
    private static void comparisonTransformation() {
        double num = 2.7;
        System.out.println((int) num); //просто отбрасывает дробную часть
        System.out.println(Math.round(num)); //округляет до ближайшего целого
        System.out.println(Math.floor(num)); //округляет вниз
        System.out.println(Math.ceil(num)); //округляет вверх

        System.out.println((int) -num); //просто отбрасывает дробную часть
        /*если после запятой 5 и больше, то в сторону 0, то есть большую
        * и наоборот для чисел меньше 4*/
        System.out.println(Math.round(-num));
        //округляет вниз, то есть в меньшую сторону, будет -3
        System.out.println(Math.floor(-num));
        //округляет вверх, то есть в большую сторону, будет -2
        System.out.println(Math.ceil(-num));
    }
    //2.6
    private static void comparisonFloatDouble() {
        float fBig = 1234567.0f;
        float fSmall = 0.12345f;
        double dBig = 1234567.0;
        double dSmall = 0.12345f;
        System.out.println("Сложение float: " + (fBig + fSmall));
        System.out.println("Сложение double: " + (dBig + dSmall));
    }

}
