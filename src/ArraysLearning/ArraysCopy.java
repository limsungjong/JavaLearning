package ArraysLearning;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        arrayCopy();
    }

    public static void arrayCopy() {
        int[] origin = new int[]{1, 5, 2, 4, 6, 3};
        int[] copyArr1 = Arrays.copyOf(origin,5);
        int[] copyArr2 = Arrays.copyOf(origin,2);
        int[] copyArr3 = Arrays.copyOf(origin,8);

        System.out.println(Arrays.toString(copyArr1));
        // 출력 : [1, 5, 2, 4, 6, 3]
        System.out.println(Arrays.toString(copyArr2));
        // 출력 : [1, 5]
        System.out.println(Arrays.toString(copyArr3));
        // 출력 : [1, 5, 2, 4, 6, 3, 0, 0]
    }
}
