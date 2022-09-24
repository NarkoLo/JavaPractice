package task10;

import java.util.Scanner;

public class SubTask8 {
    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder(word);
        if(word.equals(sb.reverse().toString()))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
