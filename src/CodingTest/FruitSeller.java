package CodingTest;

import java.util.*;
/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/135808
    과일 장수
    과일 장수가 사과 상자를 포장하고 있습니다.
    사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며,
    k점이 최상품의 사과이고 1점이 최하품의 사과입니다.
    사과 한 상자의 가격은 다음과 같이 결정됩니다.
    - 한 상자에서 사과를 m개씩 담아 포장합니다.
    - 상자에 담긴 사과 중 가장 낮은 점수가 p (1 <= p <= k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.
    과일 장수가 가능한 많은 사과를 팔았을 때,
    얻을 수 있는 최대 이익을 계산하고자 합니다.(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)
    예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면,
    다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.
    - (최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8
    사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때,
    과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.

    case 1
    k = 3 , m = 4 , score = [1, 2, 3, 1, 2, 3, 1]
    result = 8

    case 2
    k = 4 , m = 3 , score = [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]
    result = 33
 */
public class FruitSeller {
    public static void main(String[] args) {
        int k1 = 3;
        int m1 = 4;
        int[] score1 = new int[]{1, 2, 3, 1, 2, 3, 1};
        solution(k1, m1, score1);

        int k2 = 4;
        int m2 = 3;
        int[] score2 = new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        solution(k2, m2, score2);
    }

    public static int solution(int k, int m, int[] score) {
        // 먼저 전체 배열을 정렬하여 내림 차순으로 함 1,2,3...
        Arrays.sort(score);
        // 상자의 갯수를 미리 구함 사과 / 상자에 들어갈 갯수
        int maxBoxLength = score.length / m;
        // 답변으로 사용할 box 개수 위에서 만든 갯수 만큼 공간을 만듬
        int[] box = new int[maxBoxLength];
        // 박스 번호 라고 생각하면 됨
        int idx = 0;
        // 최저 값 10부터 하나씩 줄여감
        int min = 10;
        // 먼저 score로 들어올 사과 갯수 크기의 for선언 1바퀴마다 상자에 들어갈 사과 갯수만큼 줄어듬
        // ex) score.length 1,000,000까지임, m이 5라면 1바퀴 돌면 i = 999,995가 될것임
        // 즉, 여기서 1바퀴는 1박스 완성을 의미함
        for (int i = score.length - 1; i >= m-1; i -= m) {
            // j는 i, j 가 i - m 보다 크면 멈춤, j는 계속 빠짐
            // 즉, 여기서 1바퀴는 box에 사과를 1개씩 넣는 작업이라고 생각하면 됨.
            // 종료 되는 시점은 1box가 완성 되는 시점임
            for (int j = i; j > i - m; j--) {
                min = Math.min(min, score[j]);
            }
            // 위에서 만든 min * m을 해서 box 배열에 추가함
            box[idx++] = min * m;
        }
        // box 배열의 모든 값을 더 해서 나온 값을 return함
        System.out.println(Arrays.toString(box));
        return Arrays.stream(box).sum();
    }
}
