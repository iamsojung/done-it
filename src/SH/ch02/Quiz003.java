package SH.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int data = Integer.parseInt(stringTokenizer.nextToken());
        int line = Integer.parseInt(stringTokenizer.nextToken());

        int[] arrays = new int[data + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= data; i++) {
            arrays[i] = arrays[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 1; i <= line; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(arrays[s] - arrays[a - 1]);
        }
    }
}
