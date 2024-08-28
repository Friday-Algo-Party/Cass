package p1978_소수찾기;

import java.util.*;
import java.io.*;
public class Main {

//    소수는 1과 자기 자신 외에는 다른 어떤 수로도 나누어 떨어지지 않는 수를 의미합니다.
//    만약 num이 두 수 a와 b의 곱으로 표현될 수 있다면, a와 b 중 하나는 반드시 num의 제곱근 이하인 수가 있습니다.


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));//입력받기

        int n = Integer.parseInt(br.readLine()); // 갯수 입력 받음

        int[] num = new int [n]; // n개의 길이로 배열 선언
        StringTokenizer st = new StringTokenizer (br.readLine());

        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken()); //소수값 입력 받음
        }

        int count = 0; // 소수가 몇개인지 출력

        for (int i : num) {  //for each문 : i값에 num배열값을 한 개씩 순차적으로 변수명에 대입되어 실행
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num){

        if(num == 1) { //1은 소수가 아님
            return false;
        }

        for (int k = 2; k <= Math.sqrt(num); k++ ){  // 소수를 판별하는 공식
            if (num % k == 0) return false;          // 예를 들어 8을 생각해보면, 8 = 2 × 4입니다. 여기서 2는 8의 제곱근인 약 2.828보다 작고, 4는 크다.
                                                     // 제곱근을 기준으로 소수 여부를 확인한 후 제곱근 이상의 수를 검사할 필요가 없어짐을 알 수 있다.
        }

        return true;
    }

}

