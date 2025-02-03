package Baekjoon.P9498_시험성적;

import java.io.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System. in)) ; //입력받기 String으로 출력됨

        int score = Integer.parseInt(br.readLine());//int형으로 변경 , 한줄만 읽기

        if(score>=90 && score<=100 ){
            System.out.println("A");
        }else if(score>=80 && score<=89){
            System.out.println("B");
        }else if(score>=70 && score<=79){
            System.out.println("C");
        }else if(score>=60 && score<=69){
            System.out.println("D");
        }else{
            System.out.println("F");
        }


    }
}


//package Baekjoon.시험성적;
//
//import java.util.*;
//        import java.io.*;
//
/////시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
////첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//
//        if( a>=90 && a<=100) {
//            System.out.println("A");
//        }else if( a>= 80 && a<= 89){
//            System.out.println("B");
//        }else if( a>= 70 && a<= 79){
//            System.out.println("C");
//        }else if( a>= 60 && a<= 69){
//            System.out.println("D");
//        }else if( a>= 0 && a<= 59){
//            System.out.println("F");
//        }
//
//
//    }
//}
