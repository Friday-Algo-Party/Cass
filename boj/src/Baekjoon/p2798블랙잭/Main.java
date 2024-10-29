package Baekjoon.p2798블랙잭;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //카드 개수
        int m = Integer.parseInt(st.nextToken());

        int result = 0; //결과값
        int[] num = new int[n];// n개의 카드에 대한 배열 생성
        st = new StringTokenizer(br.readLine()); // 두 번째 줄에서 새 입력 읽기

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken()); // i번째 카드의 숫자 저장
        }
        for (int i = 0; i < n - 2; i++) { // 첫 번째 카드
            for (int j = i+1; j < n - 1; j++) { // 두 번째 카드
                for (int k = j+1; k < n; k++) { // 세 번째 카드
                    int sum = num[i] + num[j] + num[k];  // 세 카드의 숫자의 합
                    if (sum <= m) {   //합이 m 이하인지 확인
                        result = Math.max(result, sum);
                        // 현재까지의 최고 합계와 현재 합을 비교하여 더 큰 값을 result에 저장
                    }
                }
            }
        }
        System.out.print(result);
    }
}


