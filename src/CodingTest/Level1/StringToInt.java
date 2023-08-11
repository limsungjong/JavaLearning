package CodingTest.Level1;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12925
    문자열을 정수로 바꾸기
    문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

    case 1 s = "1234" result = 1234
    case 2 s = "-1234" result = -1234
 */
public class StringToInt {
    public static void main(String[] args) {
        String str1 = "1234";
        String str2 = "-1234";

        solution(str1);
        solution(str2);
    }

    public static int solution(String str) {
        return Integer.parseInt(str);
    }
}
