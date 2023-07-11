package Algorithms.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 5, 2, 5, 7, 2, 1};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if(data[i] < data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}