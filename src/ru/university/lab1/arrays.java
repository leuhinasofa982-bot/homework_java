package ru.university.lab1;

import java.util.Arrays;

public class arrays {
    public static void run() {
        int[] arr = arrOfRandom(5);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        minMaxMean(arr);
        bubleSort(arr);
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        comparison();
        //-------------------------------
        System.out.println();
        System.out.println("Матрица:");
        int[][] matrix = matrix(5, 5);
        for(int[] row : matrix){
            for(int value : row){
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
        int[][] transposedMatrix = transposition(matrix);
        System.out.println("Транспонированная матрица:");
        for(int[] row : transposedMatrix){
            for(int value : row){
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    //---------------------------------
    //Одномерные массивы
    //5.1
    private static int[] arrOfRandom(int N){
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    //5.2
    private static void minMaxMean(int[] arr){
        int max = arr[0];
        int min = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
            sum += arr[i];
        }
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Среднее: " + (sum / arr.length));
    }
    //5.3
    //Пузырьковая сортировка
    private static int[] bubleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    //5.4
    private static void comparison(){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        //Сравнивает ссылки(на какую память ссылаются), а не содержимое
        System.out.println(arr1 == arr2);
        //Аналогично, т.к. не переопределено для сравнения содержимого
        System.out.println(arr1.equals(arr2));
        //Поэлементное сравнение, перед этим сравнивает длину
        System.out.println(Arrays.equals(arr1, arr2));
    }
    //-----------------------------------------------------
    //Многомерные массивы
    //6.1
    private static int[][] matrix(int M, int N){
        int[][] matrix = new int[M][N];
        for(int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }
    //6.2
    private static int[][] transposition(int[][] matrix){
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) { //по строке
            for (int j = 0; j < matrix[i].length; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
