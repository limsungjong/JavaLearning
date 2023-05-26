package ArraysLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        insertionPoint();
    }
    public static void binarySearch() {
        int[] intArr = new int[]{1, 5, 2, 4, 6, 3};
        char[] charArr = new char[]{'q', 'b', 'f', 't', 'e', 'j', 'a'};

        // 정렬 하지 않고 출력
        System.out.println(Arrays.binarySearch(intArr, 5));
        // 출력 : -5
        System.out.println(Arrays.binarySearch(charArr, 'q'));
        // 출력 : -4

        // sort메소드를 이용하여 정렬
        Arrays.sort(intArr);
        Arrays.sort(charArr);

        // 정렬 되고 난 후의 출력
        System.out.println(Arrays.binarySearch(intArr, 5));
        // 출력 : 4
        System.out.println(Arrays.binarySearch(charArr, 'q'));
        // 출력 : 5

        // 찾지 못 하는 경우
        System.out.println(Arrays.binarySearch(intArr, 10));
        // 출력 : -7
        System.out.println(Arrays.binarySearch(charArr, 'x'));
        // 출력 : -8
    }

    public static void insertionPoint() {
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 8, 9};
        int target = 7;
        // 배열에서 1부터 9까지 있지만 7은 비어 있기 때문에 7을 채워보자

        int insertionPoint = Arrays.binarySearch(intArr, target);
        // 1. 7을 key 값으로 전달하여 찾아 본다. 없기 때문에 insertionPoint를 반환한다.
        System.out.println(insertionPoint);
        // 출력 : -7이다.

        if (insertionPoint < 0) {
            // 만약 insertionPoint 값이 음수라면 진행
            int IP = -insertionPoint - 1;
            // 먼저 배열에 삽입할 index 값으로 변환한다.
            // 이 과정에서 배열의 길이보다 -1을 하고 음수에서 양수로 변환
            System.out.println(IP);
            // 출력 : 6

            // 동적으로 Array를 조작해야 하기 때문에 ArrayList를 만든다.
            List<Integer> tmpArrList = new ArrayList<>(Arrays.asList(Arrays.stream(intArr).boxed().toArray(Integer[]::new)));
            // 위에서 만든 tmpArrList에 intArr2의 모든 값을 추가한다.
            // int[] => Integer[] => List<Integer> 형태로 전환된다.

            tmpArrList.add(IP, target);
            // IP index에 target 값이 동적으로 중간에 추가된다.

            intArr = tmpArrList.stream().mapToInt(Integer::intValue).toArray();
            // 위의 과정을 모두 거치고 난 List를 다시 int[] 원시 타입의 배열로 전환하여 할당
        }
        System.out.println(Arrays.toString(intArr));
        // 출력 : [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
