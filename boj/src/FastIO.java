import java.io.*;
import java.util.*;

public class FastIO {
    public static void main(String[] args) throws IOException {
//        빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//      빠른 출력
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        br.readLine() : 입력된 한 줄을 읽는다
//        Integer.parseInt(문자열) : string-> int 타입 변환
        int N = Integer.parseInt(br.readLine());
        System.out.println(N);
//        StringTokenizer : 문자열을 띄어쓰기를 기준으로 쪼개주는 객체
//        StringTokenizer의 생성자에게 문자열을 매개변수로 전달해주면 문자열을 쪼개서 가지고 있는다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
//            st.nextToken() : 가지고 있는 문자열 토큰들을 호출할 때마다 하나씩 퉤
//            더 이상 가지고 있는 문자열 토큰이 없다면 오류 발생
            System.out.println(st.nextToken());
        }

    }
}
