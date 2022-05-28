package SH.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[N];
        long[] C = new long[M];
        long ans = 0;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        S[0] = Integer.parseInt(stringTokenizer.nextToken());
        for(int i = 1; i < N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 0; i < N; i++) {
            int D = (int) S[i] % M;
            if(D == 0) { ans++; }
            C[D]++;
        }
        System.out.println("ans: " + ans);
        for(int i = 0; i < M; i++) {
            System.out.println("C: " + C[i]);
            if(C[i] > 1) { ans = ans + (C[i] * (C[i] - 1) / 2); }
        }
        System.out.println(ans);
    }
}
