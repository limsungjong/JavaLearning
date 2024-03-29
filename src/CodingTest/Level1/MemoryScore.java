package CodingTest.Level1;

import java.util.Arrays;
import java.util.HashMap;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/176963
    추억 점수
    사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다.
    사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다.
    예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가
    [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다.
    다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고 ["kali", "mari", "don"]의
    그리움 점수가 각각 [11점, 1점, 55점]]이고, "tony"는 그리움 점수가 없을 때,
    이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.

    그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning,
    각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때,
    사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요.

    case 1
    name = ["may", "kein", "kain", "radi"]
    yearning = [5, 10, 1, 3]
    photo = [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]
    result = [19, 15, 6]

    case 2
    name = ["kali", "mari", "don"]
    yearning = [11, 1, 55]
    photo = [["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]
    result = [67, 0, 55]

    case 3
    name = ["may", "kein", "kain", "radi"]
    yearning = [5, 10, 1, 3]
    photo = [["may"],["kein", "deny", "may"], ["kon", "coni"]]
    result = [5, 15, 0]
* */
public class MemoryScore {
    public static void main(String[] args) {
        String[] name1 = new String[]{"may", "kein", "kain", "radi"};
        int[] yearning1 = new int[]{5, 10, 1, 3};
        String[][] photo1 = new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        String[] name2 = new String[]{"kali", "mari", "don"};
        int[] yearning2 = new int[]{11, 1, 55};
        String[][] photo2 = new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};

        String[] name3 = new String[]{"may", "kein", "kain", "radi"};
        int[] yearning3 = new int[]{5, 10, 1, 3};
        String[][] photo3 = new String[][]{{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        Solution x = new Solution();
        System.out.println(Arrays.toString(x.solution(name1, yearning1, photo1)));

        System.out.println(Arrays.toString(x.solution(name2, yearning2, photo2)));

        System.out.println(Arrays.toString(x.solution(name3, yearning3, photo3)));
    }

    /*
    일반적인 2중 배열을 생각하면 가능은 하나 검색하는 시간 복잡도가 크기 때문에 검색쪽을 HashMap을 사용하여
    점수 매기는 쪽의 검색 시간을 Big O(1)로 줄이면 통과가 가능하다.
     */
    static class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photos) {
            int[] answer = new int[photos.length];

            HashMap<String, Integer> score = new HashMap<>();
            for (int i = 0; i < yearning.length; i++) {
                score.put(name[i], yearning[i]);
            }

            int idx = 0;
            for (String[] photo : photos) {
                int value = 0;
                for (String x : photo) {
                    if (score.get(x) != null) {
                        value += score.get(x);
                    }
                }
                answer[idx] = value;
                idx++;
            }
            return answer;
        }
    }
}