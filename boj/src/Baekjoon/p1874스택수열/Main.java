package Baekjoon.p1874스택수열;


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 수열의 길이
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int current = 1; // 1부터 시작
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            // target보다 작거나 같을 때까지 push
            while (current <= target) {
                stack.push(current);
                sb.append("+\n");
                current++;
            }

            // 스택의 top이 target과 같으면 pop
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? sb.toString() : "NO");

//        if (isPossible) {
//            System.out.println(sb.toString());
//        } else {
//            System.out.println("NO");
//        }

    }
}
