package CodingTest;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/147355
    크기가 작은 부분 문자열
    숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p의 길이가 같은 부분문자열 중에서, 이 부분문자열이
    나타내는 수가 p가 나타내는 수보다 적거나 같은 것이 나오는 횟수를 return 하는 함수가 solution 을 완성하세요.
    t = "3141592"이고 p = "271"인 경우, t의 길이가 3인 부분 문자열은 314,141,415,159,592입니다.
    이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141,159 2개입니다.
    case 1 t = "3141592" p = "271" => 2
    case 1 t = "500220839878" p = "7" => 8
    case 1 t = "10203" p = "15" => 3
 */
public class SmallPartialString {
    public static int solution(String t, String p) {
        long peekInt = Long.parseLong(p);
        long tLength = t.length();
        long pLength = p.length();
        int count = 0;
        for (int i = 0; i <= tLength - pLength; i++) {
            String sub = t.substring(i, i + (int)pLength);
            if(Long.parseLong(sub) <= peekInt) {
                count++;
            }
        }
        return count;
    }
}
