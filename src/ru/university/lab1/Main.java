package ru.university.lab1;

import java.util.Scanner;

public class Main {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- МЕНЮ -----");
            System.out.println("1. numbers");
            System.out.println("2. strings");
            System.out.println("3. arrays");
            System.out.println("4. utils");
            System.out.println("5. выход");
            System.out.println("Выберите пункт: ");

            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else{
                System.out.println("Нужно выбрать пункт!");
                scanner.next();
                choice = -1;
            }

            if((choice < 1 || choice > 5) && (choice != -1)) {
                System.out.println("Такого пункта нет!");
            } else {
                String result = switch (choice){
                    case 1 -> {
                        numbers.run();
                        yield "";
                    }
                    case 2 -> {
                        strings.run();
                        yield "";
                    }
                    case 3 -> {
                        arrays.run();
                        yield "";
                    }
                    case 4 -> {
                        util.run();
                        yield "";
                    }
                    case 5 -> "Выход из программы";
                    default -> "Ошибка выбора!";
                };
                if (!result.isEmpty()) {
                    System.out.println(result);
                }
            }
        } while (choice != 5);
        scanner.close();
    }
}