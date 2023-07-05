package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        ex();
    }

    static void InsertionSortExam() {
        int[] data = new int[]{8, 5, 2, 5, 6, 1, 2, 4, 5, 3, 7, 1, 9};
        for (int i = 1; i < data.length; i++) {
            // i는 1부터 시작하여 배열 끝까지 진행
            int target = data[i];
            // 타겟에는 i번째 요소의 값을 선택

            int j = i - 1;
            // j는 i - 1이다.

            // while 진입 시점에서 target 값은 변하지 않는다.
            // target 값을 기준으로 아래의 while 문으로 배열 전체를 확인
            while (j >= 0 && target < data[j]) {
                // target 값은 변하지 않으며 data[j]의 값만 변화시킨다
                // 1. j 값은 0보다 크거나 같아야 하며 --> 배열 가장 밑에까지 내려온다
                // 2. target 값은 data[j]보다 작아야 한다 --> 2가지 target 값과 data[j] 값을 비교한다

                data[j + 1] = data[j];
                // 위에 값을 비교하여 target 값 보다 작은 값이 있다면
                // 3. j + 1 의 위치의 값에다가 j의 값을 대입한다.

                j--;
                // 4. j값을 하나 빼고 다시 위의 while 루틴을 시작
            }

            data[j + 1] = target;
            // 5. 위의 while 문을 거치고 난 후 j + 1 자리에 target 값을 저장하고 다시 for 루틴 시작
        }
        System.out.println(Arrays.toString(data));
        // 출력 : [1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9]
    }

    static void ex() {
        int[] data = new int[]{8, 5, 2, 5, 6, 1, 2, 4, 5, 3, 7, 1, 9};

        for (int i = 1; i < data.length; i++) {
            // 2가지가 필요하다

            int target = data[i];
            // target 값은 배열에서 첫번 째가 아니고 두 번째 값부터 해야 한다.

            int j = i - 1;
            // j는 왜 i - 1?
            // 배열 처음부터 돌아야 한다. 그렇기 때문에 j는 i - 1로 시작해야 한다.

            // 이제 반복문 필요, 배열을 전체를 확인하면서 j의 값을 변화 시켜야 한다.
            while (j >= 0 && target < data[j]) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = target;
        }
        System.out.println(Arrays.toString(data));
    }
}
