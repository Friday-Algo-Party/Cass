package Baekjoon.배열중복제거후오름차순;
import java.util.*;
import java.io.*;

// int[] a = {5, 5, 4, 1, 6, 7, 2, 5, 2, 6, 8};
// 중복제거 후 오름차순

class Main {
    public static void main(String[] args) {

        int[] a = {5, 5, 4, 1, 6, 7, 2, 5, 2, 6, 8};

        //배열을 list로 변경
        List<Integer> list = new ArrayList<>();

        for (int b : a) {
            list.add(b);
        }

        //HashSet은 자동으로 중복제거가 됨
        HashSet<Integer> set = new HashSet<>(list);

        //다시 list로변경
        List<Integer> num = new ArrayList<>(set);

        //오름차순 정렬
        Collections.sort(num);

        //내림차순
        //Collections.sort(num, Collections.reverseOrder());

        System.out.println(num);

    }
}