package Baekjoon.p10828_스택;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 명령어 개수 입력

        Stack<Integer> stack = new Stack<>(); // 정수형 스택 생성


        StringBuilder sb = new StringBuilder(); // 출력 결과를 모아서 한 번에 출력

        for (int i = 0; i < n; i++) {
            String command = br.readLine(); // 명령어 한 줄 입력

            if (command.startsWith("push")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                stack.push(num); // 숫자 스택에 추가
            } else if (command.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }


        System.out.print(sb);
    }
}