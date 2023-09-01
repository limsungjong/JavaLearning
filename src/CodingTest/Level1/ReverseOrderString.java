package CodingTest.Level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12917
    문자열 내림차순으로 배치하기

    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    s	        return
    "Zbcdefg"	"gfedcbZ"
 */

public class ReverseOrderString {
    public static void main(String[] args) {
        solution("Zbcdefg");
    }

    public static String solution(String s) {

        char[] charArray = s.toCharArray();

        Character[] characters = new Character[charArray.length];

        for(int i = 0; i < charArray.length; i++) {
            characters[i] = charArray[i];
        }

        Arrays.sort(characters,Comparator.reverseOrder());

        return Arrays.stream(characters).map(String::valueOf).collect(Collectors.joining());
    }
}
