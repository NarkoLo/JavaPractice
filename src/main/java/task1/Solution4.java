package task1;



import java.util.Arrays;
import java.util.Random;

public class Solution4 {
    static int size = (int) (Math.random() * 100);
    static int[] mas = new int[size];


    public static void main(String[] args) {
        for (int i = 0; i<size; i++){
            mas[i] = new Random().nextInt(100);
        }
        Arrays.stream(mas).forEach(x -> System.out.print(x + " "));
        System.out.println();
        Arrays.stream(mas).sorted().forEach(x -> System.out.print(x + " "));
    }
}
