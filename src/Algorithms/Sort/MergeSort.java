package Algorithms.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 7, 4, 1, 2, 3};
    }

    public static <T extends Comparable<T>> void mergeSort1(T[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int middle = arr.length / 2;
        T[] left = Arrays.copyOfRange(arr, 0, middle);
        T[] right = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort1(left);
        mergeSort1(right);

        merge(arr, left, right);
    }

    public static void mergeSort2() {

    }

    public static <T extends Comparable<T>> void merge(T[] arr, T[] left, T[] right) {


    }
}
