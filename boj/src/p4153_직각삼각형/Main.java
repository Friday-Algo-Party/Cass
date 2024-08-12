package p4153_직각삼각형;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new  InputStreamReader(System.in)); //입력받기

        while(true){
            StringTokenizer st =new StringTokenizer(br.readLine());//띄어쓰기 기준으로 잘라서 읽음

            int a  = Integer.parseInt(st.nextToken()); //각변의 int형으로 변경 한글자씩 읽음?
            a = a*a;
            int b  = Integer.parseInt(st.nextToken());
            b = b*b;
            int c  = Integer.parseInt(st.nextToken());
            c = c*c;

            if(a==0 && b==0 && c==0) break;

            if(a + b == c){ //a^2 + b^2 = c^2
                System.out.println("right");
            } else if (b + c == a) {
                System.out.println("right");
            } else if (c + a == b) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }



        }
    }
}
