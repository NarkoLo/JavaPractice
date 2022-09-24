package task1;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args){
        System.out.println(args.length);
        Arrays.stream(args).forEach(System.out::println);
    }
}
