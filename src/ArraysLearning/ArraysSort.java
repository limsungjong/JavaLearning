package ArraysLearning;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArraysSort {
    public static void main(String[] args) {
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

    static void valueSortASC() {
        int number = 35124687;
        // 1.String.valueOf메소드로 문자열로 변환
        String numberToStr = String.valueOf(number);

        // 2.String에 구현되어 있는 toCharArray메소드로 char[] 형태로 변환
        char[] strToCharArr = numberToStr.toCharArray();

        // 3.Arrays에 구현되어 있는 sort메소드로 오름차순으로 변환(1,2,3,...)
        Arrays.sort(strToCharArr);

        // 정렬된 char[]을 String.valutOf()메소드로 다시 문자열로 변환
        String charArrToStr = String.valueOf(strToCharArr);

        // 마지막으로 String을 Integer에 구현되어 있는 parseInt메소드로 int값으로 변환
        int result = Integer.parseInt(charArrToStr);

        System.out.println(result);
        // 출력 : 12345678
    }

    static void valueSortDESC2() {
        // 1.String.valueOf메소드로 문자열로 변환
        int number = 35124687;
        String numberToString = String.valueOf(number);

        // 2.int가 아닌 Integer로 사용해야 sort를 사용 가능
        Integer[] strToIntegerArr = new Integer[numberToString.length()];
        for (int i = 0; i < numberToString.length(); i++) {
            strToIntegerArr[i] = Integer.parseInt(String.valueOf(numberToString.charAt(i)));
        }

        // 3.Arrays에 구현되어 있는 sort메소드에 첫 번째 인자로는 동일한 정렬하고자 하는 배열
        // 두 번째 인자로 Comparator compare를 구현하여 전달하면 됩니다.
        Arrays.sort(strToIntegerArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            } // o2 - o1은 내림차순, o1 - o2는 오름차순
        });

        // 4.stringBuilder를 이용하여 Integer배열에 있는 값을 추가
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : strToIntegerArr) {
            stringBuilder.append(i);
        }

        // 5. result에 string을 int로 변환하여 저장
        int result = Integer.parseInt(stringBuilder.toString());
        System.out.println(result);
    }

    static void valueSortDESC() {
        int number = 35124687;
        // 1.String.valueOf메소드로 문자열로 변환
        String numberToStr = String.valueOf(number);

        // 2.char[]이 아닌 Character[]로 해야함
        Character[] strToCharArr = new Character[numberToStr.length()];
        for (int i = 0; i < numberToStr.length(); i++) {
            strToCharArr[i] = numberToStr.charAt(i);
        }

        // 3.Arrays에 구현되어 있는 sort메소드로 오름차순으로 변환(1,2,3,...)
        Arrays.sort(strToCharArr, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1; // o2 - o1 역순, o1 - o2 정순
            }
        });

        // 4.stringBuilder를 이용하여 string 형태로 전환
        StringBuilder stringBuilder = new StringBuilder();
        for (Character i : strToCharArr) {
            stringBuilder.append(i);
        }

        // 5. result에 int로 변환하여 저장
        int result = Integer.parseInt(stringBuilder.toString());
        System.out.println(result);
    }
}
