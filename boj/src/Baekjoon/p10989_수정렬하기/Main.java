package Baekjoon.p10989_수정렬하기;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받아~

        int n = Integer.parseInt(br.readLine());// 갯수 입력 받기
        int [] arr = new int[n]; // 배열에다 받을 거다~

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine()); //값 하나씩 읽어와~
        }

        Arrays.sort(arr);// Arrays.sort로 기본 오른차순 정렬~

        StringBuilder sb = new StringBuilder();// StringBUilder로 한번에 모아서 출력~
                                               // 이거 안했더니 시간 초과로 못풀었음;;

        for(int i = 0; i < n; i++){
            sb.append(arr[i]).append("\n"); //StringBuilder로 추가
        }

        System.out.println(sb);
    }
}
