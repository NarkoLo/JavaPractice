package task10;

import java.util.Scanner;

public class SubTask1 {
    public static void main(String[] args) {
        int k = 0;
        int j = 1;
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; ++i) {
            System.out.print(j+ " ");
            k++;
            if (j == k) {
                k = 0;
                j++;
            }
        }
    }
}
