package CodingTest.Level1;
/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12977
    소수 만들기

    주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
    nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

    입출력 예 #1
    [1,2,4]를 이용해서 7을 만들 수 있습니다.

    입출력 예 #2
    [1,2,4]를 이용해서 7을 만들 수 있습니다.
    [1,4,6]을 이용해서 11을 만들 수 있습니다.
    [2,4,7]을 이용해서 13을 만들 수 있습니다.
    [4,6,7]을 이용해서 17을 만들 수 있습니다.

    case 1
    nums = [1,2,3,4]
    return 1

    case 2
    nums = [1,2,7,6,4]
    return 4
 */
public class ThreeNumberToGetPrimeNumber {
    public static void main(String[] args) {
        int case1 = solution(new int[]{1, 2, 3, 4});
        int case2 = solution(new int[]{1, 2, 7, 6, 4});
        System.out.println(case1);
        System.out.println(case2);
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 1 + i; j < nums.length - 1; j++) {
                for (int k = 1 + j; k < nums.length; k++) {
                    if (getPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static boolean getPrime(int num) {
        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
