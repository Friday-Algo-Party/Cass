package test;

import java.util.* ;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // BufferedReader 객체 생성
//
//        int n = Integer.parseInt(br.readLine());
//        int [] num  = new int[n];
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        for(int i = 0; i < n; i++){
//            num[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i = 0; i < n; i++){
//            System.out.print(num[i] + " ");
//        }

        String [] num = new String[2];
        num[0] = "1";
        num[1] = "2";

        for(int i = 0; i<num.length; i ++){
            System.out.println(num[i]);
        }


        List<String> al = new ArrayList<>(); //List는 제네릭과 같이씀
        al.add("one"); // 배열값 추가 할 때 .add 사용한다.
        al.add("two");

        for(int i =0; i<al.size(); i++){
            String value = al.get(i);
            System.out.println(value);
        }


    }
}