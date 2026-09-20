package edu.course.lab01;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Команда не указана!");
            return;
        }
        String command = args[0];
        switch (command){
            case "fizzbuzz":
                FizzBuzz.fizzbuzz();
                break;
            case "reverse":
                if(args.length != 2) {
                    System.out.println("Указана неверно строка для reverse");
                    return;
                }
                System.out.println("Перевернутое слово: " + TextTasks.reverse(args[1]));
                break;
            case "quadratic":
                if (args.length != 4) {
                    System.out.println("Указаны неверно входные данные");
                    return;
                }
                QuadraticEquation.quadratic(Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
                break;
            case "series":
                SeriesCalculator.series();
                break;
            case "palindrome":
                if(args.length != 2) {
                    System.out.println("Указана неверно строка для palindrome");
                    return;
                }
                System.out.println(TextTasks.palindrome(args[1]));
                break;
            default:
                System.out.println("Неизвестная команда: " + command);
        }
    }
}
