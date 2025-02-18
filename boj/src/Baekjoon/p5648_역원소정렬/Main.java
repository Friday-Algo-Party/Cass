package Baekjoon.p5648_역원소정렬;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 사용하여 입력을 받음

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 첫 번째 숫자는 N


        List<Long> numbers = new ArrayList<>(); // 숫자를 저장할 리스트


        while (st.hasMoreTokens()) { // 더 이상 읽을 토큰이 있는지 확인
            long num = Long.parseLong(st.nextToken()); // 숫자 입력
            long reversed = reverseNumber(num); // 숫자 뒤집기
            numbers.add(reversed); // 리스트에 추가
        }


        while (numbers.size() < N) { // 추가적인 입력이 있을 경우 처리 (줄바꿈 입력)
             st = new StringTokenizer(br.readLine()); // 한줄 읽기
            while (st.hasMoreTokens()) { // 더 이상 읽을 토큰이 있는지 확인
                long num = Long.parseLong(st.nextToken());
                long reversed = reverseNumber(num);
                numbers.add(reversed);
            }
        }


        Collections.sort(numbers); // 정렬


        for (long num : numbers) {   // 정렬된 결과 출력
            System.out.println(num);
        }
    }

                                                    //이부분 다시 복습
    private static long reverseNumber(long num) { // 숫자를 뒤집는 함수
        String reversedStr = new StringBuilder(String.valueOf(num)).reverse().toString();  //String.valueOf(num) num의 내용을 string타입으로 변경
        return Long.parseLong(reversedStr); // 뒤집힌 문자열을 다시 숫자로 변환
    }
}
