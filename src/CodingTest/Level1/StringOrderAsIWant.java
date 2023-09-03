package CodingTest.Level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12915
    문자열 내 마음대로 정렬하기

    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

    제한 조건
    strings는 길이 1 이상, 50이하인 배열입니다.
    strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
    strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
    모든 strings의 원소의 길이는 n보다 큽니다.
    인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

    입출력 예
            strings	                n	return
    case1   ["sun", "bed", "car"]	1	["car", "bed", "sun"]
    case2   ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
 */

public class StringOrderAsIWant {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    public static String[] solution(String[] strings, int n) {
        List<String> stringArrayList = Arrays.asList(strings);
        stringArrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                Character i1 = o1.charAt(n);
                Character i2 = o2.charAt(n);
                int x = i1.compareTo(i2);

                if(x == 0) {
                    return o1.compareTo(o2);
                }

                return i1.compareTo(i2);
            }
        });

        return stringArrayList.toArray(String[]::new);
    }
}
