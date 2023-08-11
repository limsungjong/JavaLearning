package CodingTest.Level1;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12954
    x만큼 간격이 있는 n개의 숫자

    함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

    제한 조건
        x는 -10000000 이상, 10000000 이하인 정수입니다.
        n은 1000 이하인 자연수입니다.

    case 1
    x = 2 n = 5
    result = [2,4,6,8,10]

    case 2
    x = 4 n = 3
    result = [4,8,12]

    case 3
    x = -4 n = 2
    result = [-4, -8]
 */
public class N_NumbersSpacedByX {
    public static void main(String[] args) {
        int x1 = 2;
        int n1 = 5;
        solution(x1, n1);

        int x2 = 4;
        int n2 = 3;
        solution(x2, n2);

        int x3 = -4;
        int n3 = 2;
        solution(x3, n3);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (long i = 1; i <= n; i++) {
            answer[Math.toIntExact(i - 1)] = i * x;
        }
        return answer;
    }
}
