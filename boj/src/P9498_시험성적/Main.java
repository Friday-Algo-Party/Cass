package P9498_시험성적;

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
