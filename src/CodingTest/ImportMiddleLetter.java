package CodingTest;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12903
    가운데 글자 가져오기
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

    case 1
    s = "abcde"
    return "c"

    case 2
    s = "qwer"
    return "we"
 */
public class ImportMiddleLetter {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "qwer";

        String answer1 = solution(str1);
        System.out.println(answer1);

        String answer2 = solution(str2);
        System.out.println(answer2);
    }

    public static String solution(String s) {
        return s.length() % 2 == 0 ? s.charAt(s.length() / 2 - 1) + String.valueOf(s.charAt((s.length() / 2))) : String.valueOf(s.charAt(s.length() / 2));
    }
}
