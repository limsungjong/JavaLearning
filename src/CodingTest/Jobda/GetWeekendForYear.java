package CodingTest.Jobda;

/*
    지난 2022년, 병호는 목표를 위해 아주 열심히 달려왔다. 너무 열심히 한 탓일까?..
    2023년 병호는 자신이 얼마나 합법적으로 쉴 수 있는지 계산해보려고 한다.
    2023년에는 다행히 윤년이 아니다! 즉, 2월은 28일 까지뿐이라 하루를 덜 일할 수 있다.

    2023년 1월 1일이 무슨 요일인지 주어질 때, 병호가 며칠 쉴 수 있는지 계산해보자. 단, 병호는 주말(토요일, 일요일)만 쉰다고 가정한다.

    입력
    X: 1월 1일이 무슨 요일인지 의미한다. 1은 월요일, 2는 화요일, 3은 수요일, … 7은 일요일을 의미한다. ( 1<=X<=7)

    출력
    주말에만 쉬는 불쌍한 병호가 총 며칠 쉬는지 반환한다.

    예시 입출력
    X	return
    7	105

    달력은 이미지 참조
 */
public class GetWeekendForYear {
    public static void main(String[] args) {
        int answer = solution(7);

        System.out.println(answer);
    }

    public static int solution(int X) {
        int answer = 0;
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int currentDay = X;

        for( int month = 1; month <= 12; month++) {
            int monthInDays = months[month];

            for(int day = 1; day <= monthInDays; day++) {
                if(currentDay == 6 || currentDay == 7) {
                    answer++;
                }

                currentDay = (currentDay % 7) + 1;
            }
        }


        return answer;
    }
}
