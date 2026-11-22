package ru.university.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class strings {
    public static void run() {
        palindrome("а роза упала на лапу Азора");
        System.out.println(changeWordOrder("кот съел мышь"));
        allCounting("В мутной воде");
    }

    //----------------------------------------
    //Обработка текста
    //4.1
    private static void palindrome (String phrase){
        System.out.print("Строка палиндром? ");
        int length = phrase.length();
        int right = length - 1;
        int left = 0;
        while (right > left) {
            if (Character.isWhitespace(phrase.charAt(right))
                    || phrase.charAt(right) == ',') {
                right--;
                continue;
            }
            if (Character.isWhitespace(phrase.charAt(left))
                    || phrase.charAt(left) == ',') {
                left++;
                continue;
            }
            char ch1 = Character.toLowerCase(phrase.charAt(right));
            char ch2 = Character.toLowerCase(phrase.charAt(left));
            if (ch1 != ch2) {
                System.out.println(false);
            }
            right--;
            left++;
        }
        System.out.println(true);
    }
    //4.2
    private static String changeWordOrder(String phrase){
        List<String> wordsArr = new ArrayList<>();
        String currentWord = "";
        for(int i = 0; i <= (phrase.length() - 1); i++) {
            if(Character.isWhitespace(phrase.charAt(i))) {
                wordsArr.add(currentWord);
                currentWord = "";
            } else {
                currentWord += phrase.charAt(i);
            }
        }
        if (!currentWord.isEmpty()) {
            wordsArr.add(currentWord);
        }
        String newPhrase = "";
        while(!wordsArr.isEmpty()) {
            int order = ThreadLocalRandom.current().nextInt(0, wordsArr.size());
            newPhrase += wordsArr.remove(order) + " ";
            //сразу удаляет слово из списка, при этом возвращает его, и добавляет в строку
        }
        return newPhrase.trim(); //убирает последний пробел
    }
    //4.3
    private static void allCounting(String phrase) {
        String vowels = "аеёиоуыэюя";
        String consonants = "бвгджзйклмнпрстфхцчшщъь";
        String numbers = "0123456789";
        int vowAmount = 0;
        int consAmount = 0;
        int numAmount = 0;
        int spaceAmount = 0;
        for (int i = 0; i < phrase.length(); i++){
            if(Character.isWhitespace(phrase.charAt(i))){
                spaceAmount++;
            } else if (vowels.contains(String.valueOf(phrase.toLowerCase().charAt(i)))) {
                vowAmount++;
            }else if (consonants.contains(String.valueOf(phrase.toLowerCase().charAt(i)))) {
                consAmount++;
            }else if (numbers.contains(String.valueOf(phrase.toLowerCase().charAt(i)))) {
                numAmount++;
            }
        }
        System.out.println("Количество гласных: " + vowAmount);
        System.out.println("Количество согласных: " + consAmount);
        System.out.println("Количество цифр: " + numAmount);
        System.out.println("Количество пробелов: " + spaceAmount);
    }
}
