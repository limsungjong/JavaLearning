package CodingTest.Jobda;
/*
    지난 2022년, 병호는 목표를 위해 아주 열심히 달려왔다. 너무 열심히 한 탓일까?..
    2023년 병호는 자신이 얼마나 합법적으로 쉴 수 있는지 계산해보려고 한다.
    2023년에는 다행히 윤년이 아니다! 즉, 2월은 28일 까지뿐이라 하루를 덜 일할 수 있다.

    2023년 1월 1일이 무슨 요일인지 주어지고 공휴일에 대한 정보가 주어질 때, 병호가 며칠 쉴 수 있는지 계산해보자.

    병호는 주말(토요일, 일요일)과 공휴일에 쉰다고 가정한다.

    입력
    X: 1월 1일이 무슨 요일인지 의미한다. 1은 월요일, 2는 화요일, 3은 수요일, … 7은 일요일을 의미한다. ( 1<=X<=7)
    H(M,D): 공휴일 정보로 M월 D일이 공휴일 임을 의미한다.

    출력
    공휴일에도 드디어 쉴 수 있는 병호가 총 며칠 쉬는지 반환한다.

    예시 입출력
    X	H	                                                                                                        return
    7	[[1,1],[1,21],[1,22],[1,23],[3,1],[5,5],[5,27],[6,6],[8,15],[9,28],[9,29],[9,30],[10,3],[10,9],[12,25]]	    115
 */
public class GetWeekendAndHolyDays {
    public static void main(String[] args) {
        int[][] H = {{1, 1}, {1, 21}, {1, 22}, {1, 23}, {3, 1}, {5, 5}, {5, 27}, {6, 6}, {8, 15}, {9, 28}, {9, 29}, {9, 30}, {10, 3}, {10, 9}, {12, 25}};
        int answer = solution(7, H);

        System.out.println(answer);
    }

    public static int solution(int X, int[][] H) {
        int answer = 0;
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int currentDay = X;

        for( int month = 1; month <= 12; month++) {
            int monthInDays = months[month];

            for(int day = 1; day <= monthInDays; day++) {
                if(currentDay == 6 || currentDay == 7 || isHolyDay(H, month, day)) {
                    answer++;
                }

                currentDay = (currentDay % 7) + 1;
            }
        }


        return answer;
    }

    public static boolean isHolyDay(int[][] H, int month, int day) {
        boolean isHoly = false;

        for( int i = 0; i < H.length; i++) {
            if(H[i][0] == month) {
                for(int j = 0; j < H[i].length; j++) {
                    if(H[i][1] == day) {
                        return true;
                    }
                }
            }
        }

        return isHoly;
    }
}
