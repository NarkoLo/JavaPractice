package task1;

public class Solution5 {
    public static void main(String[] args) {
        facCalc(10);
    }

    public static void facCalc(int x){
        int facValue = 1;
        for (int i = 1; i <= x; i++) {
            facValue *= i;
        }
        System.out.println(facValue);
    }

}

