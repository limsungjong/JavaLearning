package CodingTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12901
    2016년

    2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아
    2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.
    예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

    case 1
    a = 5, b = 24
    result = "TUE"
 */

public class YearOf2016 {
    public static void main(String[] args) {
        System.out.println(solution1(5,24));
    }

    public static String solution1(int a, int b) {
        StringBuilder answer = new StringBuilder();
        LocalDate localDate = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        int dayOfWeekNumber = dayOfWeek.getValue();

        switch (dayOfWeekNumber) {
            case 1 -> {
                answer.append("MON");
            }
            case 2 -> {
                answer.append("TUE");
            }
            case 3 -> {
                answer.append("WED");
            }
            case 4 -> {
                answer.append("THU");
            }
            case 5 -> {
                answer.append("FRI");
            }
            case 6 -> {
                answer.append("SAT");
            }
            case 7 -> {
                answer.append("SUN");
            }
        }
        return answer.toString();
    }

    public static String solution2(int a, int b) {
        StringBuilder answer = new StringBuilder();




        return answer.toString();
    }
}
