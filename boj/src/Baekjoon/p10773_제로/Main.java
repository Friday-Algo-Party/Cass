package Baekjoon.p10773_제로;
import java.util.*;
import java.io.*;

//스택은 마지막에 들어온게 가장 빨리 나간다 LIFO
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>(); // stack 선언
        int k = Integer.parseInt(br.readLine()); // 정수 갯수 읽어오기

        for(int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine()); //정수 읽어오기
            if(num == 0){
                stack.pop(); //팝으로 맨위 원소 날려버림
            } else if(num > 0){
                stack.push(num); // push로 추가
            }
        }

        int sum = 0; //합 정수 생성

        for(int i : stack){
            sum += i;
        }

        System.out.println(sum);
    }
}
