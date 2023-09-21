package Algorithms.Sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 3, 1, 7, 4, 8, 9};
        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // 왼쪽 자식이 루트보다 크면 largest 변경
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // 오른쪽 자식이 루트보다 크면 largest 변경
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // largest가 변경되었으면 루트와 largest 위치 교환
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // 재귀적으로 최대 힙 구성
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 최대 힙 구성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 배열에서 요소 하나씩 교체하며 정렬
        for (int i = n - 1; i > 0; i--) {
            // 최대값(루트)을 배열의 끝으로 이동
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 최대 힙을 재구성
            heapify(arr, i, 0);
        }
    }
}