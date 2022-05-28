package HS.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =
                new StringTokenizer(br.readLine());

        int size = Integer.valueOf(st.nextToken());

        int[][] sumArr = new int[size][size];

        int quizCount = Integer.valueOf(st.nextToken());

        // 4 3
        // 1 2 3 4
        // 2 3 4 5
        // 3 4 5 6
        // 4 5 6 7
        // 2 2 3 4
        // 3 4 3 4
        // 1 1 4 4
        //
        int sum = 0;
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < size; j++) {
               sumArr[i][j] = sum + Integer.valueOf(st.nextToken());
            }
        }

        int[] result = new int[quizCount];

        for (int i = 0; i < quizCount; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.valueOf(st.nextToken());
            int y1 = Integer.valueOf(st.nextToken());

            int x2 = Integer.valueOf(st.nextToken());
            int y2 = Integer.valueOf(st.nextToken());

            result[i] = sumArr[y2][x2] - sumArr[y1][x1];
            System.out.println(result[i]);
        }

        for (int i = 0; i < quizCount; i++) {
            System.out.println(result[i]);
        }



    }
}
