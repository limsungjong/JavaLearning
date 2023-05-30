package CodingTest;

import java.util.Arrays;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/86051
    없는 숫자 더하기

    0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

    case 1
    numbers = [1,2,3,4,6,7,8,0]
    result = 14
    5와 9가 없으므로 5 + 9 = 14를 return

    case 1
    numbers = [5,8,4,0,6,7,9]
    1,2,3이 없으므로 1 + 2 + 3 = 6을 return

 */
public class AddNumberDeosntExist {
    public static void main(String[] args) {
        int[] case1 = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        int[] case2 = new int[]{5, 8, 4, 0, 6, 7, 9};
        solution(case1);
        solution(case2);
    }

    public static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < 10; i++) {
            if (Arrays.binarySearch(numbers, i) < 0) {
                answer += i;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
