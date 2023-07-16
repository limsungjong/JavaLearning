package CodingTest;

/*
    프로그래머스 level : 1
    https://school.programmers.co.kr/learn/courses/30/lessons/17682
    [1차] 다트 게임

    카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에
    다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다.
    갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다.
    다트 게임의 점수 계산 로직은 아래와 같다.

    다트 게임은 총 3번의 기회로 구성된다.
    각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
    점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
    옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
    스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
    스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
    스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
    Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
    스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
    0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.

    1	1S2D*3T	    37	1^1 * 2 + 2^2 * 2 + 3^3
    2	1D2S#10S	9	1^2 + 2^1 * (-1) + 10^1
    3	1D2S0T	    3	1^2 + 2^1 + 0^3
    4	1S*2T*3S	23	1^1 * 2 * 2 + 2^3 * 2 + 3^1
    5	1D#2S*3S	5	1^2 * (-1) * 2 + 2^1 * 2 + 3^1
    6	1T2D3D#	    -4	1^3 + 2^2 + 3^2 * (-1)
    7	1D2S3T*	    59	1^2 + 2^1 * 2 + 3^3 * 2
    8	1S2D*3T*	72	1^1 + 2^2 * 2 + 3^3 * 2
 */

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DartGame {
    public static void main(String[] args) {
        String[] cases = {"1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*", "1S2D*3T*"};
        for (String caseStr : cases) {
            System.out.println(solution(caseStr));
        }
    }

    public static int solution(String dartResult) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        int answer = 0;

        String regex = "(\\d+|[A-Z][*#]?)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dartResult);

        int count = 0;
        while (matcher.find()) {
            if (count % 2 == 0) integerArrayList.add(Integer.parseInt(matcher.group()));
            else stringList.add(matcher.group());
            count++;
        }

        for (int i = 0; i < 3; i++) {
            char Multi = stringList.get(i).charAt(0);
            int value = integerArrayList.get(i);
            switch (Multi) {
                case 'S':
                    answerList.add(i, (int) Math.pow(value, 1));
                    break;
                case 'D':
                    answerList.add(i, (int) Math.pow(value, 2));
                    break;
                case 'T':
                    answerList.add(i, (int) Math.pow(value, 3));
                    break;
            }
            if (stringList.get(i).length() > 1) {
                char exp = stringList.get(i).charAt(1);
                switch (exp) {
                    case '*':
                        int a = answerList.get(i) * 2;
                        answerList.set(i, a);
                        if (i != 0) {
                            int b = answerList.get(i - 1) * 2;
                            answerList.set(i - 1, b);
                        }
                        break;
                    case '#':
                        int c = answerList.get(i);
                        answerList.set(i, c * -1);
                        break;
                }
            }
        }
        for (Integer v : answerList) {
            answer += v;
        }
        return answer;
    }
}
