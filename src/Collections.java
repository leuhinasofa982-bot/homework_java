import java.util.*;

public class Collections {
    public static void run(){
        occurrences(listFromArr(arrOfRandomNum(10)));
    }

    private static int[] arrOfRandomNum(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = (int) (Math.random() * 101);
        }
        return arr;
    }
    private static ArrayList<Integer> listFromArr(int[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int num : arr){
            numbers.add(num);
        }
        return numbers;
    }
    private static List<Integer> sort(List<Integer> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Как вы хотите отсортировать? (1 - по возрастанию, 2 - по убыванию)");
        int choice = scan.nextInt();
        
        if(choice == 1) {
            java.util.Collections.sort(list);
        } else if (choice == 2) {
            java.util.Collections.sort(list, java.util.Collections.reverseOrder());
        } else {
            return null; //некорректное число
        }
        return list;
    }
    private static List<Integer> shuffle(List<Integer> list) {
        java.util.Collections.shuffle(list);
        return list;
    }
    private static List<Integer> rotate(List<Integer> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("В какую сторону вы хотите сдвинуть список? (1 - влево, 2- вправо)");
        int choice = scan.nextInt();
        if (choice == 1){
            java.util.Collections.rotate(list, -1);
        } else if (choice == 2) {
            java.util.Collections.rotate(list, 1);
        } else {
            return null; //некорректное число
        }
        return list;
    }
    private static List<Integer> unique(List<Integer> list){
        /*Сначала перевели во множество(тк без повторов),
        * потом перевели обратно в список(тк по усл нужно),
        * LinkedHashSet тк важна та же последовательность*/
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);
        return uniqueList;
    }
    private static List<Integer> repeats(List<Integer> list){
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> duplicates = new ArrayList<>();
        for (int element : list) {
            //индекс первого вхождения элемента
            if(set.contains(element) && list.indexOf(element) != list.lastIndexOf(element)) {
                duplicates.add(element);
            }
        }
        return duplicates;
    }
    private static int[] arrFromList(List<Integer> list) {
        int count = list.size();
        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    private static void occurrences(List<Integer> list) {
        //число из списка, количество вхождений
        Map<Integer, Integer> counts = new HashMap<>();
        for(int num : list) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        System.out.println("Количество вхождений: " + counts);
    }
}
