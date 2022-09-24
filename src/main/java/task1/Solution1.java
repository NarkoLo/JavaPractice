package task1;

public class Solution1 {
    static int[] nums = {1, 2, 3, 4, 5, 6, 7, 8,};
    public static void main(String[] args) {
        int sum = 0;
        for (int num:nums) {
           sum += num;
        }
        System.out.println(sum);
    }

}
