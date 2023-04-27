package CodingTest;

import java.util.Arrays;
import java.util.HashMap;

public class MemoryScore {
    /*
    추억 점수
    https://school.programmers.co.kr/learn/courses/30/lessons/176963
    * */
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

        // [19, 15, 6]
        System.out.println(Arrays.toString(Solution(name1, yearning1, photo1)));

        // [67, 0, 55]
        System.out.println(Arrays.toString(Solution(name2, yearning2, photo2)));

        // [5, 15, 0]
        System.out.println(Arrays.toString(Solution(name3, yearning3, photo3)));
    }

    /*
    일반적인 2중 배열을 생각하면 가능은 하나 검색하는 시간 복잡도가 크기 때문에 검색쪽을 HashMap을 사용하여
    점수 매기는 쪽의 검색 시간을 Big O(1)로 줄이면 통과가 가능하다.
     */
    public static int[] Solution(String[] name, int[] yearning, String[][] photos) {
        int[] answer = new int[photos.length];
        HashMap<String, Integer> score = new HashMap<>();
        for (int i = 0; i < yearning.length; i++) {
            score.put(name[i], yearning[i]);
        }

        for(String[] photo:photos) {

        }
        return answer;
    }
}
