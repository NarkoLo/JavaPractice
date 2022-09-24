package task10;

import java.util.Scanner;

public class SubTask12 {
    public static void main(String[] args) {
        String val = new Scanner(System.in).nextLine();
        for (int i = 0; i < val.length(); i++) {
            int curChar = Integer.parseInt(String.valueOf(val.charAt(i)));
            if(curChar % 2 != 0) {
                System.out.print(curChar);
            }
        }
    }
}
