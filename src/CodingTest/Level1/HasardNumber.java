package CodingTest.Level1;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12947
    하샤드 수

    양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

            x	return
    case1   10	true
    case2   12	true
    case3   11	false
    case4   13	false
 */
public class HasardNumber {

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
        System.out.println(solution(1));
        System.out.println(solution(19));
    }

    public static boolean solution(int x) {
        boolean answer = false;

        if (x < 10) {
            return true;
        }

        String[] strings = String.valueOf(x).split("");

        int a = 0;
        for (int i = 0; i < strings.length; i++) {
            a += Integer.parseInt(strings[i]);
        }

        if(x % a == 0) {
            answer = true;
        }

        return answer;
    }
}
