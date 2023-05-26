package ArraysLearning;

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
        arrayEqu();
    }

    public static void arrayEqu() {
        int[] intArr1 = new int[]{2, 6, 4, 3, 1, 5};
        int[] intArr2 = new int[]{2, 6, 4, 3, 1, 5};
        int[] intArr3 = new int[]{2, 6, 4, 3, 1};
        int[] intArr4 = new int[]{2, 6, 4, 3, 5, 1};
        System.out.println(Arrays.equals(intArr1, intArr2));
        System.out.println(Arrays.equals(intArr1, intArr3));
        System.out.println(Arrays.equals(intArr1, intArr4));
    }
}
