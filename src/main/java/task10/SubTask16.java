package task10;

import java.util.Scanner;

public class SubTask16  {
    public static void main(String[] args) {
        System.out.println(rec());
    }
    public static int rec(){
        int n = new Scanner(System.in).nextInt();
        if(n == 0)
            return 0;
        else return  Math.max(n, rec());
    }

}

