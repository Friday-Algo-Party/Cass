package p30802_웰컴키트;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 받기 String 형으로 반환
        
        int n = Integer.parseInt(br.readLine()); // 참가자의 수 int형으로 변경 및 라인 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());//  StringTokenizer 잘라서 읽기!!

        int[] tshirt = new int[6]; // 사이즈별 신청자의 수를 저장하는 배열
        for (int i = 0; i < 6; i++) {
            tshirt[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // 티셔츠와 팬의 묶음 수 라인 읽기!!
        int T = Integer.parseInt(st.nextToken()); // 티셔츠 한 묶음 5
        int P = Integer.parseInt(st.nextToken()); // 펜의 한 묶음 7

        int tsum = 0; // 주문할 티셔츠 묶음 수
        for (int i = 0; i < 6; i++) {
            // 나누어 떨어지지 않는다면 낱개가 남아 있다는 말이므로 1묶음을 더 주문한다.
            tsum += (tshirt[i] / T) + (tshirt[i] % T == 0 ? 0 : 1);
        }

        // 주문할 티셔츠 묶음 수와 펜의 묶음 수, 낱개 수
        System.out.println(tsum);
        System.out.println(n/P + " " + n%P);
    }
}
