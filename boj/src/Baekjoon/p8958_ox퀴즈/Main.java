package Baekjoon.p8958_ox퀴즈;

import java.util.*;
import java.io.*;



public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //OX퀴즈 몇개 돌릴 껀지

        for(int i = 1; i <= n; i++) {
            String read = br.readLine(); //문자열 한 줄 읽기
            int cut = 0; //증가
            int sum = 0; //합

            for(int j = 0; j < read.length(); j++) {
                if(read.charAt(j) == 'O'){  //charAt는 문자열 0번인덱스 부터 하나씩 불러옴
                    cut++; // O가 맞으면 1증가
                    sum = sum + cut; //sum 값에 cut 추가
                }else {
                    cut = 0; // X가 나오면 카운트 0으로 초기화
                }
            }
            System.out.println(sum); // 점수 출력
        }

    }
}

