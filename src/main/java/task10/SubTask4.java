package task10;

import java.util.Arrays;
import java.util.Scanner;

public class SubTask4 {
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt();
        int d = new Scanner(System.in).nextInt();
        int counter = 0;
        char[] arr1 = new char[k];
        Arrays.fill(arr1,'9');
        for (int i = (int) Math.pow(10,k-1); i < Integer.parseInt(String.valueOf(arr1)); i++) {
            int sum = 0;
            for (int j = 1; j <= k; j++) {
                sum+=i%j;
            }
            if(d == sum)
                counter++;
        }
        System.out.println(counter);
    }
}
