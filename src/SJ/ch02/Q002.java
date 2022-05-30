package SJ.ch02;

import java.util.Scanner;

/*
 * 문제링크 : https://www.acmicpc.net/problem/1564
 * 제목 : 평균 구하기
 */
public class Q002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) max = A[i];
            sum = sum + A[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}

