package StringLearning;

public class StringBuilderLearning {

    public static void main(String[] args) {
        StringBuilderAndBufferMethod();
    }

    public static void StringBuilderAndBufferMethod() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("b"); // b
        stringBuilder.append("u"); // bu
        stringBuilder.append("i"); // bui
        stringBuilder.append("l"); // buil
        stringBuilder.append("d"); // build
        stringBuilder.append("er"); // builder
        // 뒤에 인자로 받은 문자열을 추가한다.

        stringBuilder.delete(0,2); // ilder
        // 첫 번째 인자로 받은 index부터 두 번째 인자로 받은 index까지 문자를 삭제
//        stringBuilder.delete(12,2); // java.lang.StringIndexOutOfBoundsException : start 12, end 2, length 7
        // 만약 인자로 전달한 index가 문자열 길이를 넘으면 Exception 발생


        stringBuilder.replace(0,stringBuilder.length(),"builder");
        stringBuilder.insert(0,"str "); // builder
        // 첫 번째 인자로 받은 index 뒤에 두 번째 인자로 받은 문자열을 삽입

//        stringBuilder.insert(12,"str ");
        // java.lang.StringIndexOutOfBoundsException : offset 12,length 7
        // 만약 인자로 전달한 index가 문자열 길이를 넘으면 Exception 발생

//        stringBuilder.reverse(); // redliub
        // 문자열을 뒤집는다.

        stringBuilder.replace(0,stringBuilder.length() + 1,"new String Builder"); // new String Builder
//        // 첫 번째 인자로 받은 index부터 두 번째 인자로 받은 인덱스까지 세 번째 인자의 값으로 대체
//        System.out.println(stringBuilder);

//        stringBuilder.replace(12,stringBuilder.length() + 1,"new String Builder"); // new String Builder
        // java.lang.StringIndexOutOfBoundsException: start 12, end 11, length 11
        // 만약 인자로 전달한 index가 문자열 길이를 넘으면 Exception 발생
    }
}
