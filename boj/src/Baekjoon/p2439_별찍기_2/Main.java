package Baekjoon.p2439_별찍기_2;


import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i =1; i<=n; i++){  //전체 n횟수 만큼 돌리기
            for(int j =1; j<=n-i; j++){ //공백 출력
                System.out.print(" ");
                }
            for(int k =1; k<=i; k++){  //별 출력
                System.out.print("*");
                }
            System.out.println();
        }

    }




}
