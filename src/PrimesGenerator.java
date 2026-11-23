import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimesGenerator {
    private static int N;

    public static void run() {
        System.out.println("Введите верхнюю границу: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        SetN(n);
        System.out.println("Простые числа до " + GetN()
        + ": " + generator());
    }

    private static void SetN(int n) {
        N = n;
    }
    private static int GetN(){
        return N;
    }

    private static ArrayList<Integer> generator() {
        //true - составное
        boolean[] isComposite = new boolean[N + 1];

        if(N >= 0) isComposite[0] = true;
        if(N >= 1) isComposite[1] = true;

        //long на случай если значение превысит int
        for (long p = 2; p * p <= N; p++) {
            //начинаем с p * p тк предыдущие уже были вычеркнуты
            if(!isComposite[(int) p]) { //если p - простое
                for(long multiple = p * p; multiple <= N; multiple += p){
                    isComposite[(int) multiple] = true;
                }
            }
        }

        ArrayList<Integer> primes= new ArrayList<>();
        for(int i = 2; i <= N; i++) {
            if(!isComposite[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
