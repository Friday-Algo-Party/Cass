package Baekjoon.일부터100더하기;

import java.util.*;
import java.io.*;

// 1부터 100까지 더하라 (단, 3의 배수 제외)

class Main {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0){
                continue;
            }
            sum += i;
        }

        System.out.println(sum);

    }
}