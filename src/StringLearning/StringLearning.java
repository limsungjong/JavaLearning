package StringLearning;

public class StringLearning {
    public static void main(String[] args) {
        StringMethod();
    }
    public static void StringMethod() {
        String string = "String";
        int length = string.length(); // 6
        // 해당하는 문자열의 길이를 반환

        char charAt = string.charAt(1); // "t"
        // 인자로 전달한 index의 문자를 반환
//        char noCharAt = string.charAt(10); // java.lang.StringIndexOutOfBoundsException : String index out of range
        // 만약 인자로 전달한 index가 문자열 길이를 넘으면 Exception 발생

        String str1 = string.substring(1); // "tring"
        // 첫 번째 인자 index부터 끝까지 반환
        String str2 = string.substring(1,5); // "trin"
        // 두 번째 인자까지 전달하면 해당하는 index까지의 문자열만 반환
//        String noSearch = string.substring(10); // java.lang.StringIndexOutOfBoundsException : String index out of range
        // 만약 인자로 전달한 index가 문자열 길이를 넘으면 Exception 발생

        String string2 = "string";
        String string3 = "string3";
        boolean equal1 = string.equals(string2); // true
        boolean equal2 = string.equals(string3); // false
        // 인자로 전달한 값과 같은지 확인

        boolean contains1 = string.contains("X"); // false
        boolean contains2 = string.contains("ring"); // true
        // 인자로 전달한 CharSequence가 포함되어 있는지 확인

        String upperString = string.toUpperCase(); // "STRING"
        String lowerString = string.toLowerCase(); // "string"
        // 각각 upper는 문자열 전체를 대문자로, lower는 문자열 전체를 소문자로 변환

        String replString1 = string.replace("ring","rong"); // "Strong"
        String replString2 = string.replace('v','o'); // "Sting"
        // 첫 번째 인자로 전달한 문자 또는 문자열이 있다면 두 번째로 전달한 문자열로 변환
        // 만약 없다면 따로 변화는 없음
        
        char[] charArr = string.toCharArray(); // [S, t, r, i, n, g]
        // 문자열을 한 글자씩 char[] 형태로 변환

        String strConcat = string.concat("StrConcat"); // StringStrConcat
        // 문자열 뒤에 인자로 전달한 문자열을 이어 붙임

        int index = string.indexOf("in"); // 3
        // 전달한 인자가 있는 index값을 반환
        int noIndex = string.indexOf("q"); // -1
        // 전달한 인자에 해당하는 값이 없다면 -1 반환
        int lastIndex = string.lastIndexOf("g"); // 5
        // 전달한 인자를 뒤에서부터 찾아서 index값을 반환
    }
}
