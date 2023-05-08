package CodingTest;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/147355
    크기가 작은 부분 문자열
    숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p의 길이가 같은 부분문자열 중에서, 이 부분문자열이
    나타내는 수가 p가 나타내는 수보다 적거나 같은 것이 나오는 횟수를 return 하는 함수가 solution 을 완성하세요.
    t = "3141592"이고 p = "271"인 경우, t의 길이가 3인 부분 문자열은 314,141,415,159,592입니다.
    이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141,159 2개입니다.
    case 1 t = "3141592" p = "271" => 2
    case 1 t = "500220839878" p = "7" => 8
    case 1 t = "10203" p = "15" => 3
 */
public class SmallPartialString {
    public static void main(String[] args) {
        String t1 = "3141592";
        String p1 = "271";
        System.out.println(solution(t1, p1));

        String t2 = "500220839878";
        String p2 = "7";
        System.out.println(solution(t2, p2));

        String t3 = "10203";
        String p3 = "15";
        System.out.println(solution(t3, p3));
    }

    /*
    일반적인 방법으로는 쉽게 풀수 있었다. 다만 나는 중간에 런타임 에러가 발생했는데
    찾아보니 이유는 peekLong 이 부분과 Long.parseLong(sub) 이 부분을 long타입이 아닌
    int 타입으로 인해 발생하는 문제였다. 값이 너무 크기 때문에 int로는 담을수 없는 범위의 값이
    들어와서 계속 런타임에러가 발생했다. 이 2가지 부분을 long타입으로 변경해서 해결할 수 있었다.
     */
    public static int solution(String t, String p) {
        long peekLong = Long.parseLong(p);
        long tLength = t.length();
        long pLength = p.length();
        int count = 0;
        for (int i = 0; i <= tLength - pLength; i++) {
            String sub = t.substring(i, i + (int) pLength);
            if (Long.parseLong(sub) <= peekLong) {
                count++;
            }
        }
        return count;
    }
}
