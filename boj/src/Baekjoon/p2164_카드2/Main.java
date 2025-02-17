package Baekjoon.p2164_카드2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 카드 개수 입력


        Queue<Integer> queue = new LinkedList<>();   // Queue 생성


        for (int i = 1; i <= N; i++) { // 1부터 N까지의 숫자를 큐에 추가
            queue.add(i);
        }


        while (queue.size() > 1) {   // 카드 게임 진행
            queue.poll(); // 제일 위의 카드 버리기
            queue.add(queue.poll()); // 다음 카드를 맨 뒤로 보내기
        }


        System.out.println(queue.poll());// 마지막 남은 카드 출력
    }
}