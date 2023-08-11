package CodingTest.Level1;

/*
    문제 설명
    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
    문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

    제한 조건
    공백은 아무리 밀어도 공백입니다.
    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    s의 길이는 8000이하입니다.
    n은 1 이상, 25이하인 자연수입니다.

    입출력 예
    s	    n	result
    "AB"	1	"BC"
    "z"	    1	"a"
    "a B z"	4	"e F d"
 */
public class CaesarsPassword {
    public static void main(String[] args) {
        String case1 = "AB";
        System.out.println(solution(case1,1));

        String case2 = "z";
        System.out.println(solution(case2,1));

        String case3 = "a B z";
        System.out.println(solution(case3,4));
    }

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer.append(" ");
            } else if(s.charAt(i) >= 'a') {
                char x = (char) ((s.charAt(i) + n - 'a') % 26 + 'a');
                answer.append(x);
            } else {
                char x = (char) ((s.charAt(i) + n - 'A') % 26 + 'A');
                answer.append(x);
            }
        }
        return answer.toString();
    }
}
