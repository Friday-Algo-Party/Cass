package Baekjoon.p1436_영화감독숌;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int cut = 1;

        while( cut != n ){

            num++;

            if(String.valueOf(num).contains("666")){  //num을 문자열로 변환 후 666이 포함되어 있는지 확인.
                cut++;
            }
        }
        System.out.println(num);

    }

}
