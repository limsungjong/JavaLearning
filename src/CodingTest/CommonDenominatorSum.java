package CodingTest;
/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12928
    약수의 합

    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

    case 1
    n = 12
    result = 28

    case 2
    n = 5
    result = 6
 */
public class CommonDenominatorSum {
    public static void main(String[] args) {
        solution(12);
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }
        System.out.println(answer);
        return answer;
    }
}
