package Concept;

import java.util.*;

class Human {

    private final int age;

    int getAge() {
        return this.age;
    }

    Human(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "human age : " + this.age;
    }
}

public class ComparatorExam {
    public static void main(String[] args) {
        integerComparator();
        classComparator();
        stringComparator();
    }

    public static void integerComparator() {
        // Collections를 활용
        List<Integer> arrays = new ArrayList<>();
        arrays.add(40);
        arrays.add(10);
        arrays.add(30);
        arrays.add(20);
        arrays.add(0);
        arrays.add(50);
        Collections.sort(arrays, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? 1 : o1 == o2 ? 0 : -1;
            }
        });

        System.out.println(arrays);
        // 출력 : [0, 10, 20, 30, 40, 50]
    }

    public static void stringComparator() {
        // Arrays를 활용
        String[] stringArr = new String[]{"a", "b", "q", "u", "s", "c"};
        Arrays.sort(stringArr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(stringArr));
        // 출력 : [u, s, q, c, b, a]
    }

    public static void classComparator() {
        Comparator<Human> ageComparator = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() < o2.getAge() ? 1 : o1.getAge() == o2.getAge() ? 0 : -1;
            }
        };

        // Collections를 활용
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(10));
        humanList.add(new Human(50));
        humanList.add(new Human(30));
        humanList.add(new Human(20));
        humanList.add(new Human(40));

        Collections.sort(humanList, ageComparator);

        System.out.println(humanList);
        // 출력 : [human age : 50, human age : 40, human age : 30, human age : 20, human age : 10]
    }
}