package CodingTest.Level2;

import java.util.Arrays;

/*
    프로그래머스 level : 2
    https://school.programmers.co.kr/learn/courses/30/lessons/154538
    숫자 변환하기

    자연수 x를 y로 변환하려고 합니다. 사용할 수 있는 연산은 다음과 같습니다.

    1. x에 n을 더합니다
    2. x에 2를 곱합니다.
    3. x에 3을 곱합니다.
    자연수 x, y, n이 매개변수로 주어질 때, x를 y로 변환하기 위해 필요한 최소 연산 횟수를 return하도록 solution 함수를 완성해주세요.
    이때 x를 y로 만들 수 없다면 -1을 return 해주세요.

    x	y	n	result
    10	40	5	2
    10	40	30	1
    2	5	4	-1
 */

public class ToConvertNumbers {

    public static void main(String[] args) {
        System.out.println(solution(10,40,5));
        System.out.println(solution(10,40,30));
        System.out.println(solution(2,5,4));
    }
    public static int solution(int x, int y, int n) {
        // 배열의 전체 크기를 목표로 하는 y값의 +1 만큼 배열을 생성
        int[] dp = new int[y + 1];

        // 초기값을 설정 배열 전체를 가장 큰 값으로 모두 채움
        // [2147483647, 2147483647, ...] 이런식으로
        Arrays.fill(dp, Integer.MAX_VALUE); // 초기값을 최대값으로 설정

        dp[x] = 0; // 시작점의 연산 횟수는 0

        for (int i = x; i <= y; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue; // i를 만들 수 없는 경우 스킵
            }

            // i + n 의 값이 y보다 작은 경우에 진행
            if (i + n <= y) {
                dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
            }

            // i * 2 의 값이 y보다 작은 경우에 진행ㅋ
            if (i * 2 <= y) {
                dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
            }

            // i + n 의 값이 y보다 작은 경우에 진행
            if (i * 3 <= y) {
                dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
            }
        }
        return dp[y] == Integer.MAX_VALUE ? -1 : dp[y];
    }
}
