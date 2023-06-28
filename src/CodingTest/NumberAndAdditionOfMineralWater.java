package CodingTest;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/77884
    약수의 개수와 덧셈

    두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

    case 1
    left = 13, right = 17
    result = 43
    수	    약수	            약수의 개수
    13	    1, 13	        2
    14	    1, 2, 7, 14	    4
    15	    1, 3, 5, 15	    4
    16	    1, 2, 4, 8, 16	5
    17	    1, 17	        2

    따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.

    case 2
    left = 24, right = 27
    result = 52
    수	        약수	                          약수의 개수
    24	        1, 2, 3, 4, 6, 8, 12, 24	  8
    25	        1, 5, 25	                  3
    26	        1, 2, 13, 26	              4
    27	        1, 3, 9, 27	                  4

    따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.
 */
public class NumberAndAdditionOfMineralWater {
    public static void main(String[] args) {
        int case1 = solution(13,17);
        int case2 = solution(24,27);

        System.out.println(case1);
        System.out.println(case2);
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = 0; i <= right - left; i++) {
            int v = m(left + i);
            if(v % 2 ==0) {
                answer+=left + i;
            } else {
                answer-=left + i;
            }
        }
        return answer;
    }

    public static int m(int m) {
        int x = 0;
        for (int i = 1; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                x++;
                if (i * i != m) {
                    x++;
                }
            }
        }
        return x;
    }
}
