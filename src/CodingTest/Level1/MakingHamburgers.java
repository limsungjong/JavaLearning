package CodingTest.Level1;

import java.util.Stack;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/133502
    햄버거 만들기

    햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다. 함께 일을 하는
    다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고,
    상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다.
    상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다.
    상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며,
    재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.

    예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때,
    상수는 여섯 번째 재료가 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고,
    아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다.
    즉, 2개의 햄버거를 포장하게 됩니다.

    상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때,
    상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.

            ingredient	                    result
    case1   [2, 1, 1, 2, 3, 1, 2, 3, 1]	    2
    case2   [1, 3, 2, 1, 2, 1, 3, 1, 2]	    0
 */

public class MakingHamburgers {
    public static void main(String[] args) {
        int[] case1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] case2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int[] case3 = {2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 3, 1, 3, 1};
        int[] case4 = {1, 2, 3, 1, 2, 3};
        int[] case5 = {1, 2, 3, 3, 3, 1};

        int[] case6 = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        int[] case7 = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1};
        int[] case8 = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1};
        int[] case9 = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1};

//        solution(case1);
//        solution(case2);
//        solution(case3);
//        solution(case4);
//        solution(case5);
//        solution(case6);
        solution2(case7);
//        solution(case8);
//        solution(case9);

    }

    public static int solution1(int[] ingredient) {
        int answer = 0;

        StringBuilder stringBuilder = new StringBuilder();

        for (int in : ingredient) {
            stringBuilder.append(in);
        }
        String st = stringBuilder.toString();

        while (st.contains("1231")) {
            answer++;

            int idx = st.indexOf("1231");
            System.out.println(idx);
            System.out.println(st);
            st = st.substring(0, idx) + st.substring(idx + 4);

        }
        System.out.println(answer);

        return answer;
    }

    public static int solution2(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.add(i);

            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 4) == 1
                        && stack.get(stack.size() - 3) == 2
                        && stack.get(stack.size() - 2) == 3
                        && stack.get(stack.size() - 1) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}
