package ArraysLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAsList {
    public static void main(String[] args) {
        arraysAsList();
    }

    static void arraysAsList() {
        String[] strArr = {"a", "b", "c"};
        Integer[] integerArr = {1, 2, 3, 4, 5};
        int[] intArr = {5, 4, 3, 2, 1};

        List<String> strList = Arrays.asList(strArr);
        List<Integer> integerList = Arrays.asList(integerArr);

        List<Integer> boxedToArrList = Arrays.asList(Arrays.stream(intArr).boxed().toArray(Integer[]::new));
        List<Integer> boxedCollectList = Arrays.stream(intArr).boxed().collect(Collectors.toList());
        // stream.boxed를 통해 int를 Integer로 박싱 하는 작업

        System.out.println(strList);
        // 출력 : [a, b, c]
        System.out.println(integerList);
        // 출력 : [1, 2, 3, 4, 5]
        System.out.println(boxedToArrList);
        // 출력 : [5, 4, 3, 2, 1]
        System.out.println(boxedCollectList);
        // 출력 : [5, 4, 3, 2, 1]
    }
}
