package task10;

import java.util.Scanner;

public class SubTask14 {
    public static void main(String[] args) {

        row(new Scanner(System.in).nextInt());
    }
    public static void row(int x){
        if (x>0)
            row(x / 10);
        else
            return;
        System.out.print(x%10 + " ");
    }
}

