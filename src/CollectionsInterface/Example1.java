package CollectionsInterface;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        // 0 ~ 9까지 채움
        for (int i = 0; i < 10; i++) {
            list.add(i);
            stack.add(i);
        }

        // 최대값 max 메소드, 최소값 min 메소드
        System.out.println("list max() : " + Collections.max(list));
        System.out.println("stack min() : " + Collections.min(stack));

        // sort()
        Collections.sort(stack);// 오름차순
        Collections.reverse(stack); // 내림차순
        Collections.sort(stack, Collections.reverseOrder()); // 내림차순
        System.out.print("역순 출력: ");
        for (int i : stack) {
            System.out.print(i + " ");
        }

        System.out.println();
        // 섞기(shuffling) 랜덤하게 섞는다
        Collections.shuffle(stack);
        System.out.print("랜덤 출력: ");
        for (int i : stack) {
            System.out.print(i + " ");
        }

        System.out.println();
        // binarySearch() -> 해당값의 index를 반환(실패시 -1 반환)
        // 오름차순 정렬이 되어있어야 사용가능핟.
        Collections.sort(stack); // 오름차순
        System.out.print("정방향 정렬: ");
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("이진 탐색 5 값의 위치: " + Collections.binarySearch(stack,5));

        System.out.println();
        // 두 리스트가 다른지 확인 disjoint
        // 두 리스트중 공통 값이 있으면 false
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(99,98));
        System.out.println("list가 완전히 다른가? : "+ Collections.disjoint(list, list2)); // true
        System.out.println("list가 완전히 다른가? : "+ Collections.disjoint(list, stack)); // false
    }
}
