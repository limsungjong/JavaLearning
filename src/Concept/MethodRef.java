package Concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef {
    public static void main(String[] args) {
        String str = "51245";
        List<Integer> collect = Arrays.stream(str.split("")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collect);
        // 출력 : [5, 1, 2, 4, 5]

        List<Idol> idolList = Arrays.asList(new Idol("newJeans"), new Idol("twice"), new Idol("fifty"));
        String idols = idolList.stream().map(Idol::getName).collect(Collectors.joining(" "));
        System.out.println(idols);
        // 출력 : newJeans twice fifty
    }
}
