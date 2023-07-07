package org.example;

public class Main {
    public static void main(String[] args) {
        int[] nums={1, 2, 3};
        Solution tt= new Solution(nums);

        int[] temp = tt.shuffle();
        for(int val: temp) System.out.print(val+" ");
        System.out.println();
        temp = tt.reset();
        for(int val: temp) System.out.print(val+" ");
        System.out.println();
        temp = tt.shuffle();
        for(int val: temp) System.out.print(val+" ");
        System.out.println();
    }
}