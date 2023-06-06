package Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorRef {
    public static void main(String[] args) {
        // 스트림 변환
        List<String> strings = Arrays.asList("newJeans", "twice", "fifty");
        strings.stream().map(Idol::new).forEach(v -> System.out.print(v.getName() + " "));
        // 출력 : newJeans twice fifty

        // 함수형 인터페이스 구현
        Supplier<List<String>> listSupplier = ArrayList::new;

        // 인스턴스 생성
        Supplier<String> stringSupplier = String::new;
        String string = stringSupplier.get();
    }
}

class Idol {
    private final String name;

    Idol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}