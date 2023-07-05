package Sort;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = new int[]{5, 2, 1, 5, 7, 2, 5, 3};

        for (int i = 0; i < data.length - 1; i++) {
            int count = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[count]) {
                    count = j;
                }
            }
            if (data[i] > data[count]) {
                int temp = data[i];
                data[i] = data[count];
                data[count] = temp;
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
