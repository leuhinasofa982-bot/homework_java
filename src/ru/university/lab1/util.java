package ru.university.lab1;

public class util {
    public static void run(){
        operations();
        difference();
        check(15);
        swap(1, 2);
        print(10);
        print(10.10);
        print("word");
        int[] arr1 = {1, 2, 3};
        print(arr1);
        double[] arr2 = {1.1, 2.2, 3.3};

        //----------------------------
        System.out.println();
        System.out.println(summa(0));
        System.out.println(summa(arr2));

        //---------------------------
        System.out.println();
        System.out.println(powerLinear(5.2, 1));
        System.out.println(powerIterative(5.2, 1));
        System.out.println(Math.pow(5.2, 1));
        System.out.println(powerLinear(5.2, 0));
        System.out.println(powerIterative(5.2, 0));
        System.out.println(Math.pow(5.2, 0));
        System.out.println(powerLinear(5.2, -10));
        System.out.println(powerIterative(5.2, -10));
        System.out.println(Math.pow(5.2, -10));
    }

    //------------------------------------
    //Побитовые операции
    //3.1
    private static void operations(){
        //Сравнивает биты, 1 только если везде 1
        System.out.println("5 & 6 = " + (5&6));
        //Сравнивает биты, 1 если хотя бы где-то 1
        System.out.println("5 | 6 = " + (5|6));
        //Сравнивает биты, исключающее или, 1 если биты разные
        System.out.println("5 ^ 6 = " + (5^6));
        //Меняет каждый бит на противоположный
        System.out.println("~6 = " + (~6));
        //Сдвигает двоичные биты (значащие) влево, добавляет 0
        System.out.println("5 << 6 = " + (5<<6));
        //Аналогично вправо, добавляет 0 если число положительное, 1 - для отрицательного
        System.out.println("20 >> 1 = " + (20>>1));
        //Аналогично вправо, но добавляет только 0
        System.out.println("20 >>> 1 = " + (20>>>1));
    }
    //3.2
    private static void difference(){
        System.out.println("-8 >> 1 = " + (-8>>1));
        //Не сохраняется знак
        System.out.println("-8 >>> 1 = " + (-8>>>1));
    }
    //3.3
    private static void check(int num){
        if ((num & 1) == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
        /*Если число - степень 0,
        то первый бит 1, остальные - 0.
        Поэтому если вычесть 1,
        то биты поменяются на противоположные,
        а побитовое И даст 0 только если это степень 2
        (число как бы самоуничтожиться) */
        if ((num > 0) && (num & (num - 1)) == 0) {
            System.out.println("Является степенью 2");
        } else {
            System.out.println("Не является степенью 2");
        }
        /*Проверяем каждый бит,
        * например: 1101 & 0001 = 0001 (1),
        * значит последний бит - 1.
        * Сдвигаем биты вправо: 0110*/
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        System.out.println("Количество единичных битов: " + count);
    }
    //3.4
    private static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    //------------------------------------------------------
    //Методы и передача аргументов
    //7.1
    private static void print(int num){
        System.out.print(num + " ");
        System.out.println("Для int");
    }
    private static void print(double num){
        System.out.print(num + " ");
        System.out.println("Для double");
    }
    private static void print(String sentence){
        System.out.print(sentence + " ");
        System.out.println("Для String");
    }
    private static void print(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("Для int[]");
    }
    //7.2
    private static double summa(double... numbers){
        double summa = 0;
        for (double n : numbers){
            summa += n;
        }
        return summa;
    }
    //7.3
    private static double powerLinear(double number, int power){ //рекурсия
        if(power < 0) {
            return -1;
        } else if (power == 0) {
            return 1;
        } else if(power == 1){
            return number;
        }
        return number * powerLinear(number, power - 1);
    }
    private static double powerIterative(double number, int power){ //итерация
        if(power < 0) {
            return -1;
        }
        double result = 1.0;
        for(int i = 1; i <= power; i++){
            result *= number;
        }
        return result;
    }
    /*Быстрее будет выполняться итеративный алгоритм
    * т.к. рекурсия каждый раз вызывает саму себя, это тратит больше ресурсов и времени,
    * каждый вызов рекурсии требует создания нового кадра в стеке вызова,
    * у итерации фиксированный объем памяти*/
}
