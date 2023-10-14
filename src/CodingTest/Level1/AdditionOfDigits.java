package CodingTest.Level1;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12931
    자릿수 더하기

    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    제한사항
    N의 범위 : 100,000,000 이하의 자연수

    case 1
    n = 123
    result = 6

    case 2
    numbers = 987
    result = 24
*/

public class AdditionOfDigits {
    public static void main(String[] args) {
        int case1 = solution(123);
        int case2 = solution(987);

        System.out.println(case1);
        System.out.println(case2);
    }

    public static int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - 48;
        }

        return answer;
    }
}
