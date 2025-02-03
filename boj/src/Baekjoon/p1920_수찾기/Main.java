package Baekjoon.p1920_수찾기;

import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine()); // N 입력 받음

        int[] arr = new int[n];  // N개의 정수 배열을 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // N개의 정수 arr을 오름차순으로 정렬


        int m = Integer.parseInt(br.readLine());   // M 입력 받음

        StringBuilder sb = new StringBuilder(); // 결과 저장 StringBuilder

        st = new StringTokenizer(br.readLine()); // M개의 수들을 입력 받고  이 수들이 N개의 정수 배열에 존재하는지 확인하여 결과를 StringBuilder에 추가
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());


            int in = Arrays.binarySearch(arr, num); // 이진 탐색으로 M개의 수가 N개의 정수 배열에 존재하는지 확인

            if (in < 0) {
                sb.append(0 + "\n"); // 존재하지 않으면 0을 StringBuilder에 추가
            } else {
                sb.append(1 + "\n"); // 존재하면 1을 StringBuilder에 추가
            }
        }

        // 최종 결과 출력
        System.out.println(sb);
    }
}