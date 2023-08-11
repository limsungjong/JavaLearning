package CodingTest.Level1;

import java.util.Arrays;
import java.util.Comparator;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12933
    정수 내림차순으로 배치하기

    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    case 1
    n = 118372
    return 873211
 */
public class IntegerDescending {
    public static void main(String[] args) {
        System.out.println(solution(35124687));
    }

    public static int solution(int n) {

        String numberToStr = String.valueOf(n);
        Character[] arr = new Character[numberToStr.length()];
        for (int i = 0; i < numberToStr.length(); i++) {
            arr[i] = numberToStr.charAt(i);
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        StringBuilder x = new StringBuilder();
        for(Character v : arr) {
            x.append(v);
        }
        int answer = Integer.parseInt(x.toString());
        System.out.println(answer);
        return answer;
    }
}
