package org.example;

import java.util.Random;

public class Solution {
    private int[] originalArray;  // Array to store the original elements
    private int len;              // Length of the array
    private Random random;
    /**
     * Constructs a new Solution object with the given array of integers.
     *
     * @param nums The array of integers.
     */
    public Solution(int[] nums) {
        len = nums.length;
        random = new Random();
        originalArray = nums.clone();
    }

    /**
     * Resets the array to its original state.
     *
     * @return The original array.
     */
    public int[] reset() {
        return originalArray;
    }

    /**
     * Shuffles the array and returns the shuffled array.
     *
     * @return The shuffled array.
     */
    public int[] shuffle() {
        int[] tempArray = originalArray.clone();

        // Fisher-Yates shuffle algorithm
        for (int i = len - 1; i > 0; i--) {
            swap(tempArray, i, random.nextInt(i + 1));
        }

        return tempArray;
    }

    /**
     * Swaps two elements in the given array.
     *
     * @param nums The array.
     * @param i    The index of the first element to swap.
     * @param j    The index of the second element to swap.
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


