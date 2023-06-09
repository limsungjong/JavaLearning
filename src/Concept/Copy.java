package Concept;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        diffCopy();
    }

    public static void diffCopy() {
        FavoriteIdol[] originalArr = new FavoriteIdol[]{new FavoriteIdol("블랙핑크"), new FavoriteIdol("트와이스"), new FavoriteIdol("피프티")};
        // 원본 배열 생성

        FavoriteIdol[] shallowCopy = Arrays.copyOf(originalArr, originalArr.length);
        // 얕은 복사로 생성한 배열

        FavoriteIdol[] deepCopy = new FavoriteIdol[originalArr.length];
        for(int i = 0; i < originalArr.length; i++) {
            deepCopy[i] = new FavoriteIdol(originalArr[i].getName());
        }
        // 깊은 복사로 생성한 배열

        System.out.println("originalArray : ");
        for (FavoriteIdol idol : originalArr) {
            System.out.print(" " + idol.getName());
        }
        // 원본 배열 출력
        System.out.println();

        System.out.println("shallowCopy : ");
        for (FavoriteIdol idol : shallowCopy) {
            System.out.print(" " + idol.getName());
        }
        // 얕은 복사 배열 출력
        System.out.println();
        
        System.out.println("deepCopy : ");
        for (FavoriteIdol idol : deepCopy) {
            System.out.print(" " + idol.getName());
        }
        // 깊은 복사 배열 출력
        System.out.println();
        
        // 원본 배열의 객체 변경
        originalArr[0].setName("뉴진스");


        System.out.println("originalArray : ");
        for (FavoriteIdol idol : originalArr) {
            System.out.print(" " + idol.getName());
        }
        // 원본 배열 출력
        System.out.println();

        System.out.println("shallowCopy : ");
        for (FavoriteIdol idol : shallowCopy) {
            System.out.print(" " + idol.getName());
        }
        // 얕은 복사 배열 출력
        System.out.println();

        System.out.println("deepCopy : ");
        for (FavoriteIdol idol : deepCopy) {
            System.out.print(" " + idol.getName());
        }
        // 깊은 복사 배열 출력
    }
    public static class FavoriteIdol {
        private String name;

        public FavoriteIdol(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
