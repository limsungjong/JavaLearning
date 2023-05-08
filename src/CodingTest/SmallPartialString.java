package CodingTest;

public class SmallPartialString {
    public static int solution(String t, String p) {
        long peekInt = Long.parseLong(p);
        long tLength = t.length();
        long pLength = p.length();
        int count = 0;
        for (int i = 0; i <= tLength - pLength; i++) {
            String sub = t.substring(i, i + (int)pLength);
            if(Long.parseLong(sub) <= peekInt) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
