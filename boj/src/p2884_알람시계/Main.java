package p2884_알람시계;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    if(m < 45){  //m이 45보다 작으면
        --h;
        m = 60-(45 - m);
    } else if(m >= 45){
        m = m - 45;
    }

    if(h < 0){
        h = 23;
    }

        System.out.println(h+" "+m);

    }
}
