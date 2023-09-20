package Algorithms.Sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 4, 1, 2, 4, 1, 2, 3, 4, 5, 2, 1, 2, 3,};
        int[] answer = countingSort(arr);

        for(int i = 0; i < answer.length; i++) {
            System.out.println(i + 1 + " : " + answer[i]);
        }
    }

    public static int[] countingSort(int[] arr) {
        int[] counting = new int[5];
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i] - 1]++;
        }
        return counting;
    }
}
