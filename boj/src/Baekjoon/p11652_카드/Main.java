package Baekjoon.p11652_카드;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //읽기 선언
        int n = Integer.parseInt(br.readLine()); //카드 N장
        Map<Long, Integer> map = new HashMap<>(); //HashMap을 이용해서 키벨류 값(수,횟수)으로 저장

        for (int i = 0; i < n; i++) {
            long m = Long.parseLong(br.readLine()); //카드에 적힌 수 읽어와서 m에저장
            map.put(m, map.getOrDefault(m, 0) + 1);//m이 map에 없으면 0, 있으면 해당 값 반환
                                                              //기존 값에 +1을 하여 등장 횟수를 저장
                                                              //getOrDefault 이거 많이 쓴다. 정리해놓자.
        }
        int max = -1; //현재까지 찾은 최대 등장 횟수 저장 //입력개수가 0개이면 예외 발생
        long num = 0; //가장 많이 등장한 숫자를 저장할 변수

        for (long x : map.keySet()) {
            if (map.get(x) > max) { //현재 숫자의 등장 횟수가 max보다 크면 최빈값을 갱신
                max = map.get(x);  //등장 횟수 갱신.
                num = x; //갱신된 값 num으로 초기화
            } else if (map.get(x) == max) {  //등장 횟수가 같은 숫자가 있으면 더 작은 숫자를 선택.
                num = Math.min(x, num); // 두 숫자 중 작은 값을 num에 저장.
            }
        }
        System.out.println(num);
    }

}