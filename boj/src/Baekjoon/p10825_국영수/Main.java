package Baekjoon.p10825_국영수;

import java.io.*;
import java.util.*;
public class Main {

    static class Student {
        String name; // 학생 이름
        int kor; // 국어 점수
        int eng; // 영어 점수
        int math; // 수학 점수

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        ArrayList<Student> list = new ArrayList<>();   // 학생 정보를 저장할 리스트 (ArrayList 사용)


        int n = Integer.parseInt(br.readLine());


        while (n-- > 0) {
            st = new StringTokenizer(br.readLine()); // 한 줄을 읽고 공백을 기준으로 분리
            String name = st.nextToken(); // 첫 번째 토큰: 학생 이름
            int kor = Integer.parseInt(st.nextToken()); // 두 번째 토큰: 국어 점수
            int eng = Integer.parseInt(st.nextToken()); // 세 번째 토큰: 영어 점수
            int math = Integer.parseInt(st.nextToken()); // 네 번째 토큰: 수학 점수

            // 리스트에 학생 객체 추가
            list.add(new Student(name, kor, eng, math));
        }

        // 학생 리스트 정렬 (Comparator 사용)
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 1. 국어 점수가 다르면 국어 점수 기준 내림차순 정렬 (높은 점수가 먼저)
                if (o1.kor != o2.kor) return o2.kor - o1.kor;

                // 2. 국어 점수가 같다면 영어 점수 기준 오름차순 정렬 (낮은 점수가 먼저)
                if (o1.eng != o2.eng) return o1.eng - o2.eng;

                // 3. 국어와 영어 점수가 같다면 수학 점수 기준 내림차순 정렬 (높은 점수가 먼저)
                if (o1.math != o2.math) return o2.math - o1.math;

                // 4. 모든 점수가 같다면 이름을 사전순(알파벳순) 오름차순 정렬
                return o1.name.compareTo(o2.name);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Student student : list) {
            sb.append(student.name).append('\n'); // 정렬된 학생의 이름 추가 (줄바꿈 포함)
        }

        System.out.println(sb);
    }
}
