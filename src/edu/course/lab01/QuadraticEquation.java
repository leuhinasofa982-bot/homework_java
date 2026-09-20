package edu.course.lab01;

public class QuadraticEquation {
    public static void quadratic(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            System.out.println("Уравнение не квадратное");
        } else if (discriminant > 0) {
            double x1 = (-b + discriminant) / 2 * a;
            double x2 = (-b - discriminant) / 2 * a;
            System.out.println("Первый корень уравнения: " + x1);
            System.out.println("Второй корень уравнения: " + x2);
        } else if (discriminant == 0) {
            double x = -b / 2 * a;
            System.out.println("Корень уравнения: " + x);
        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}
