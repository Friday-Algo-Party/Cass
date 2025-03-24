package Baekjoon.p9093단어뒤집기;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            StringBuilder sb = new StringBuilder(); //문장 저장


            while (st.hasMoreTokens()) {  // 단어가 있는 동안 반복
                 String word = st.nextToken();  // 단어 하나 꺼냄
                String reversed = new StringBuilder(word).reverse().toString();  // 단어 뒤집기
                sb.append(reversed).append(" ");  // 결과에 추가
            }

            System.out.println(sb.toString().trim());  // 마지막 공백 제거하고 출력
        }

    }
}
