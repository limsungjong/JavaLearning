package Algorithms.Sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 7, 4, 1, 2, 3};
        mergeSort1(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort1(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        mergeSort1(left);
        mergeSort1(right);

        merge(arr, left, right);
    }

    public static void mergeSort2() {

    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < (right[j])) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
