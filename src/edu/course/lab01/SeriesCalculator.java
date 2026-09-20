package edu.course.lab01;

public class SeriesCalculator {
    public static void series(){
        double summa = 0.0;
        int amount = 0;
        int n = 2;
        while (true) {
            double member = 1.0 / ((double) n*n + n - 2);
            if (member < Math.pow(10, -6)){
                break;
            }
            summa += member;
            n++;
            amount++;
        }
        System.out.println("Сумма: " + summa);
        System.out.println("Последний добавленный номер: " + (n - 1));
        System.out.println("Количество членов ряда: " + amount);
    }
}
