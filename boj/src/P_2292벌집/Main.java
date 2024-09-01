package P_2292벌집;


import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int count = 1; //지나가는 방의 갯수 (초기 값이 1인 이유는 자기 자신 포함 )
        int range = 1;

        while (range < n) {
            range = range + (6 * count); //방의 갯수가 6의 배수 이다.
            count++;

        }

        System.out.println(count);
    }
}
