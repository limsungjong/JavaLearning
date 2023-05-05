package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = new int[] {5,2,5,6,1,2,5};

        for(int i = 1; i < data.length; i++) {
            int target = data[i];

            int j = i - 1;

            while (j >= 0 && target < data[j]) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = target;
        }
        System.out.println(Arrays.toString(data));
    }
}
