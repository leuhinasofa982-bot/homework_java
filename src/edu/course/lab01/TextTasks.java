package edu.course.lab01;

public class TextTasks {
    public static String reverse(String fraze){
        int wordLength = fraze.length();
        String newWord = "";
        for (int i = wordLength - 1; i >= 0; i--) {
            newWord = newWord + fraze.charAt(i);
        }
        return newWord;
    }

    public  static boolean palindrome(String fraze) {
        int length = fraze.length();
        int right = length - 1;
        int left = 0;
        while (right > left) {
            if (Character.isWhitespace(fraze.charAt(right))) {
                right--;
                continue;
            }
            if (Character.isWhitespace(fraze.charAt(left))) {
                left++;
                continue;
            }
            char ch1 = Character.toLowerCase(fraze.charAt(right));
            char ch2 = Character.toLowerCase(fraze.charAt(left));
            if (ch1 != ch2) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
