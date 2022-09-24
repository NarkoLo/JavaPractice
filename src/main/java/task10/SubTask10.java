package task10;

import java.util.Scanner;

public class SubTask10 {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        System.out.println(reverse(value, 0));


    }
    public static int reverse(int n, int reN) {
        if(n ==0)
            return reN;
        return reverse(n/10,reN*10+n%10);
    }

}
