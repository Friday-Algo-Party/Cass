package Baekjoon.p2609_최대공약수와최소공배수;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine()); //

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 최대공약수 계산
        int max = get(a, b);  // 큰수로 나누고 나서 나머지값이 0전에 있던 값이 쵀대공약수이다.

        // 최소공배수(LCM) 계산
        int min = (a * b) / max;  // 최소공배수는 두값 a*b를 곱한 후 최대공약수로 나눈것

        // 결과 출력
        System.out.println(max);
        System.out.println(min);
    }

    // 유클리드 호제법 최대공약수 구하는 법
    public static int get(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

//1. 48 ÷ 18 = 2 …12  (나머지 12)
//2. 18 ÷ 12 = 1 …6   (나머지 6)
//3. 12 ÷ 6 = 2 …0   (나머지 0 → 종료)