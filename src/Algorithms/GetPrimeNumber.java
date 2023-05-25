package Algorithms;

import java.time.Duration;
import java.time.Instant;

public class GetPrimeNumber {
    public static boolean[] prime;
    public static int count = 0;

    public static void main(String[] args) {
        Instant start = Instant.now();
        int n = 100_000_000;
        getPrimeToEratosthenesOfChe(n);
        int x = 0;
        for(int i = 0; i < prime.length; i++) {
            if(prime[i] == false) {
                x++;
            }
        }
        Instant end = Instant.now();
        System.out.println("실행 시간 : " + Duration.between(start,end).toMillis() + "ms");
        System.out.println(n + "의 숫자까지 모두 " + x + "개 소수가 있습니다.");
    }
    public static void getPrimeToEratosthenesOfChe(int n) {
        prime = new boolean[n + 1];

        if (n < 2) {
            return;
        }

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }
    public static void getPrimeToDivideAllNumber(int n) {
        if (n < 2) {
            return;
        }

        if (n == 2) {
            count++;
            return;
        }

        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                return;
            }
        }
        count++;
    }
    public static void getPrimeToDivideByRoot(int n) {
        if (n < 2) {
            return;
        }
        // 1과 0은 소수가 아니다

        if (n == 2) {
            count++;
            return;
        }
        // 2는 소수다

        for (long i = 2; i <= Math.sqrt(n); i++) {
            // 여기에 있는 i <= Math.sqrt(n)이 된다.
            if (n % i == 0) {
                return;
            }
        }
        count++;
    }
}
