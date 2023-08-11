package CodingTest.Level1;

public class CreatePrimeNumbers {
    /*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12921
    소수 찾기

    1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

    소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
    (1은 소수가 아닙니다.)

    입출력 예 설명
    입출력 예 #1
    1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

    입출력 예 #2
    1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환

    case 1
    n = 10
    result = 4

    case 2
    n = 5
    result = 3
 */
    public static void main(String[] args) {
        int case1 =  solution(10);
        int case2 =  solution(5);

        System.out.println(case1);
        System.out.println(case2);
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (get(i)) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean get(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

