package CodingTest;

import java.util.Objects;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12919
    서울에서 김서방 찾기

    String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수,
    solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
    case1
    seoul = {"Jane", "Kim"};
    return = "김서방은 1에 있다";
 */

public class FindingKimInSeoul {
    public static void main(String[] args) {
        String[] case1 = {"Jane", "Kim"};

        System.out.println(solution(case1));
    }

    public static String solution(String[] seoul) {
        int x = 0;
        for (int i = 0; i < seoul.length; i++) {
            if(Objects.equals(seoul[i], "Kim")) {
                x = i;
            }
        }
        return "김서방은 " + x + "에 있다";
    }
}
