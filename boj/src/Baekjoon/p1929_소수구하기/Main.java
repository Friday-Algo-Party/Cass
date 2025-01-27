package Baekjoon.p1929_소수구하기;

import java.util.*;
import java.io.*;

//에라토스테네스의 체 알고리즘!!
//2부터 시작하여 어떤 수의 배수는 모두 소수가 아니므로 제거한다.
//남은 수는 소수로 판단할 수 있다.
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken()); //M 시작
        int N = Integer.parseInt(st.nextToken()); //N 종료지점

        boolean[] isNotPrime = new boolean[N + 1]; // 배열 생성 // false면 소수, true면 소수가 아님
                                                   // 기본으로 false 설정


        for (int i = 2; i <= Math.sqrt(N); i++) {  // 소수 판별 2부터 시작해서 배수 제거 (1은소수가 아님)
            if (!isNotPrime[i]) { // i가 소수라면
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true; // i의 배수는 소수가 아님
                }
            }
        }

        // M부터 N까지 소수 출력
        for (int i = M; i <= N; i++) {
            if (i > 1 && !isNotPrime[i]) {
                System.out.println(i); // 소수 출력
            }
        }
    }
}
// p1978