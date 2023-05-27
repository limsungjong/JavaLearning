package ArraysLearning;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args) {
        sortAsc();
        sortDesc();
    }
    static void sortAsc() {
        int[] intArr = new int[]{1, 5, 6, 1, 8, 3, 7, 2, 4, 8, 9};
        char[] charArr = new char[]{'q', 'b', 'f', 't', 'e', 'j', 'a'};

        Arrays.sort(intArr);
        // int 정렬
        Arrays.sort(charArr);
        // char 정렬

        System.out.println(Arrays.toString(intArr));
        // 출력 : [1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9]

        System.out.println(Arrays.toString(charArr));
        // 출력 : [a, b, e, f, j, q, t]
    }

    static void sortDesc() {
        Integer[] intArr = new Integer[]{1, 5, 6, 1, 8, 3, 7, 2, 4, 8, 9};
        Character[] charArr = new Character[]{'q', 'b', 'f', 't', 'e', 'j', 'a'};

        Arrays.sort(intArr, Comparator.reverseOrder());
        // Integer 역순으로 정렬
        Arrays.sort(charArr, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });
        // Character 역순으로 정렬

        System.out.println(Arrays.toString(intArr));
        // 출력 : [9, 8, 8, 7, 6, 5, 4, 3, 2, 1, 1]

        System.out.println(Arrays.toString(charArr));
        // 출력 : [q, b, f, t, e, j, a]
    }
}
