package Baekjoon.p1546_평균;

import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine()); //시험을 본 과목의 개수 N을 입력을 받는다

    float[] scores = new float[N];  // 현재 성적을 입력받는다.
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++){
       scores[i] = Float.parseFloat(st.nextToken());
    }
    //최댓값을 구한다.
    float M = 0;
    for (int i = 0; i < N; i++) {
        M = Math.max(M, scores[i]);
    }
    //점수/M*100 고친다.
    float sum = 0;
    for(int i=0; i<N; i++){
        scores[i] = scores[i] / M * 100;
        sum += scores[i];
    }
    //고친값을 다 더한 후 N으로 나눈다. 평균 출력한다.
    System.out.println(sum/N);

 }
}