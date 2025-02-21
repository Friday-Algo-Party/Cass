package Baekjoon.p11656_접미사배열;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s  = br.readLine(); //문열 s 읽어오기

        List<String> str = new ArrayList<>();

        for(int i = 0 ; i < s.length() ; i++){
            str.add(s.substring(i)); //str리스트에 문자열 을 substring으로 잘라서 넣음
        }

        Collections.sort(str); //list는 Collections를 사용해야한다.

        for(int i =0 ; i < str.size(); i++){
            System.out.println(str.get(i));
        }

    }


}
