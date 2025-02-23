package Baekjoon.p2775_부녀회장이될테야;

import java.io.*;

public class Main {

    //  15층까지 가능한 아파트 배열 (0~14층, 1~14호)
    public static int[][] APT = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 결과 출력을 빠르게 하기 위한 StringBuilder 사용

        make_APT(); // 아파트 호출 및 배열을 미리 계산

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력받기

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // 층 입력받기
            int n = Integer.parseInt(br.readLine()); // 호 입력받기
            sb.append(APT[k][n]).append('\n'); // 미리 계산된 결과 가져오기
        }

        System.out.println(sb); // 최종 출력 (한 번에 출력해서 속도 향상)
    }

    //  아파트의 모든 거주자 수를 미리 계산하는 함수 (DP 활용)
    public static void make_APT() {
        // 0층 초기화 (0층 i호에는 i명이 산다)
        for (int i = 0; i < 15; i++) {
            APT[i][1] = 1; // 모든 층의 1호에는 1명만 산다.
            APT[0][i] = i; // 0층의 i호에는 i명이 산다.
        }

        // 1층부터 14층까지 반복하면서, 2호부터 14호까지의 거주자 수를 채운다.
        for (int i = 1; i < 15; i++) { // 1층부터 14층까지
            for (int j = 2; j < 15; j++) { // 2호부터 14호까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j]; // 점화식 적용
            }
        }
    }
}