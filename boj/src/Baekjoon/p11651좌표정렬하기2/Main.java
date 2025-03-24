package Baekjoon.p11651좌표정렬하기2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 점의 개수

        int[][] arr= new int[n][2];  // 좌표를 저장할 2차원 배열

        // 좌표 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());  // x
            arr[i][1] = Integer.parseInt(st.nextToken());  // y
        }

        Arrays.sort(arr, new Comparator<int[]>() {  //y 오름차순 -> 같으면 x 오름차순
            @Override
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]); // y 같으면 x 비교
                }
                return Integer.compare(a[1], b[1]);     // y 비교
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}