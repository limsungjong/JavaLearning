package ArraysLearning;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        arraysToString();
    }

    public static void arraysToString() {
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        char[] charArr = new char[]{'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(charArr));
    }
}
