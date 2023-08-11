package CodingTest.Level1;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12922
    수박수박수박수박수박수?

    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

    case 1
    n = 3
    answer = "수박수"

    case 2
    n = 4
    answer = "수박수박"
 */

public class SooBakSooBakSoo {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            answer.append("수박");
        }
        if (n % 2 == 1) answer.append("수");
        return answer.toString();
    }
}
