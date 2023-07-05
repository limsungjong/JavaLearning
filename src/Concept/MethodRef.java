package Concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef {
    public static void main(String[] args) {
        // 문자열 51245의 값을 List로 변환하는 과정에서 map으로 변환하는 과정에서 Integer의 parseInt를 참조
        String str = "51245";
        List<Integer> collect = Arrays.stream(str.split("")).map(Integer::parseInt).collect(Collectors.toList());
        String[] split = str.split("");
        System.out.println(Arrays.toString(split));
        System.out.println(collect);
        // 출력 : [5, 1, 2, 4, 5]

        // List에 Idol 클래스를 담고 클래스의 이름으로 문자열을 만들기 위해 map으로 Idol.getName을 이용하여 문자열을 만든다
        List<Idol> idolList = Arrays.asList(new Idol("newJeans"), new Idol("twice"), new Idol("fifty"));
        String idols = idolList.stream().map(Idol::getName).collect(Collectors.joining(" "));
        System.out.println(idols);
        // 출력 : newJeans twice fifty
    }
}
