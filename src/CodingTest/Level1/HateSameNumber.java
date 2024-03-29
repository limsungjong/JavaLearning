package CodingTest.Level1;

import java.util.Arrays;
import java.util.Stack;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12906
    같은 숫자는 싫어

    배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
    arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
    arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
    배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

    제한사항
    배열 arr의 크기 : 1,000,000 이하의 자연수
    배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

    입출력 예
    arr	                answer
    [1,1,3,3,0,1,1]	    [1,3,0,1]
    [4,4,4,3,3]	        [4,3]
 */

public class HateSameNumber {
    public static void main(String[] args) {
        int[] case1 = {1, 1, 3, 3, 0, 1, 1};
        int[] answer1 = solution(case1);
        int[] case2 = {4,4,4,3,3};
        int[] answer2= solution(case2);

        System.out.println(Arrays.toString(answer1));
        System.out.println(Arrays.toString(answer2));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (!stack.empty() && stack.peek() == arr[i]) {
                stack.pop();
            }
            stack.add(arr[i]);
        }

        int[] answer = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
