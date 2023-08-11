package CodingTest.Level1;


import java.util.Arrays;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/12950
    행렬의 덧셈

    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

    case 1
    arr1 = [[1,2],[2,3]]
    arr2 = [[3,4],[5,6]]
    result = [[4,6],[7,9]]

    case 2
    arr1 = [[1],[2]]
    arr2 = [[3],[4]]
    result = [[4],[6]]
 */
public class ProcessionAdd {
    public static void main(String[] args) {
        int[][] case1arr1 = {{1,2},{2,3}};
        int[][] case1arr2 = {{3,4},{5,6}};
        int[][] result1 = solution(case1arr1,case1arr2);
        for (int[] a : result1) {
            System.out.println(Arrays.toString(a));
        }

        int[][] case2arr1 = {{1},{2}};
        int[][] case2arr2 = {{3},{4}};
        int[][] result2 = solution(case2arr1,case2arr2);
        for (int[] a : result2) {
            System.out.println(Arrays.toString(a));
        }
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
