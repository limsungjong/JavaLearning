package Algorithms.Sort;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.BrokenBarrierException;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 7, 4, 1, 2, 3};
//        quickSort(arr, 0, arr.length - 1);

//        for(int x : arr) {
//            System.out.print(x + " ");
//        }

//        quickSort2(arr, 0, arr.length - 1);
//
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }

        exam(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort2(int[] arr, int start, int end) {
        System.out.println("Start " + Arrays.toString(arr));
        /*
        크게 보자 왼쪽과 오른쪽으로 분할해야 한다. 재귀적으로 나를 다시 부르면서 start와 end는 바꿔서 줘야 한다
        즉, key값을 기준으로 하면 된다. 맞나? 아니지 않나?
        key는 가장 왼쪽에 있는 값이다. 즉 아니다
        무엇을?
         */
        if (start >= end) {
            return;
        }
        int key = start;
        int i = start + 1;
        int j = end;
        int temp;
        while (i <= j) {
            while (i <= end && arr[i] <= arr[key]) { // 왼쪽부터 start + 1부터 key 값보다 큰 값 찾기
                i++;
            }
            while (j > start && arr[j] >= arr[key]) { // 오른쪽에서부터 key 값 보다 작은 값 찾기
                j--;
            }

            if (i > j) { // i와 j가 엇갈린 상태라면 값을 swap
                temp = arr[j];
                arr[j] = arr[key];
                arr[key] = temp;
                break;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quickSort2(arr, start, j - 1);
        quickSort2(arr, j + 1, end);
        System.out.println("End " + Arrays.toString(arr));
    }

    public static <T extends Comparable<T>> void hoareSort(T[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = hoarePartition(arr, low, high);
            hoareSort(arr, low, pivotIndex);
            hoareSort(arr, pivotIndex + 1, high);
        }
    }

    public static <T extends Comparable<T>> int hoarePartition(T[] arr, int low, int high) {
        T pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i].compareTo(pivot) < 0);

            do {
                j--;
            } while (arr[j].compareTo(pivot) > 0);

            if (i >= j) return j;

            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // 9, 5, 6, 7, 4, 1, 2, 3
    public static void exam(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int temp;
        int i = low + 1;
        int j = high;
        int pivot = low;

        while (i <= j) {
            while (arr[i] <= arr[pivot] && i < high) {
                i++;
            }

            while (arr[j] >= arr[pivot] && j > low) {
                j--;
            }

            if(i >= j) {
                temp = arr[pivot];
                arr[pivot] = arr[j];
                arr[j] = temp;
            } else {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        exam(arr, low, j - 1);
        exam(arr, j + 1, high);
    }
}
