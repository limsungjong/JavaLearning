package Concept;

import CodingTest.ImportMiddleLetter;

public class ComparableExam {
    public static void main(String[] args) {
        integerCompare();
        characterCompare();
        classCompare();
    }

    public static void integerCompare() {
        Integer integer = 5;

        int result1 = integer.compareTo(1);
        int result2 = integer.compareTo(5);
        int result3 = integer.compareTo(10);

        System.out.println("result1 : " + result1);
        // 출력 : 1
        System.out.println("result2 : " + result2);
        // 출력 : 0
        System.out.println("result3 : " + result3);
        // 출력 : -1
    }

    public static void characterCompare() {
        String string = "b";

        int result1 = string.compareTo("a");
        int result2 = string.compareTo("b");
        int result3 = string.compareTo("c");

        System.out.println("result1 : " + result1);
        // 출력 : 1
        System.out.println("result2 : " + result2);
        // 출력 : 0
        System.out.println("result3 : " + result3);
        // 출력 : -1
    }

    public static void classCompare() {
        Person person1 = new Person(20, 1000);
        Person person2 = new Person(40, 2000);

        System.out.println("class compareTo : " + person1.compareTo(person2));
    }
}

class Person implements Comparable<Person> {
    private final int age;
    private final int money;

    Person(int age, int money) {
        this.age = age;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public int compareTo(Person o) {
        return this.age > o.getAge() ? 1 : this.age == o.getAge() ? 0 : -1;
    }
}
