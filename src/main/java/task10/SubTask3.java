package task10;
import java.util.Scanner;
public class SubTask3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(recFunc(A,B));
    }
    public static String recFunc(int a, int b){
        if (a > b) {
            return a + " " + recFunc(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recFunc(a + 1, b);
        }
    }
}
