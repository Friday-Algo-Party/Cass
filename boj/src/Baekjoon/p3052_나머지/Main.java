package Baekjoon.p3052_나머지;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //문자열로 받아 들인다.

        HashSet<Integer> set = new HashSet<>(); // HashSet은 중복된 값을 넣어도 하나만 저장된다.

        for (int i = 1; i <= 10; i++){
            set.add(Integer.parseInt(br.readLine()) % 42 ); //HashSet에다가 값을 넣는것 중복된 값은 1개만 들어감
        }

        System.out.println(set.size()); // 저장된 값의 개수 출력

    }

}
