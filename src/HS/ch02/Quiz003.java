package HS.ch02;

import java.util.Scanner;

// 구간 합 구하기 -- 미완성
public class Quiz003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }

        int[] sumArr = new int[n];
        int sum = 0;
        for (int k = 0; k < n; k++) {
            sum += arr[k];
            sumArr[k] = sum;
        }

        int[] result = new int[count];

        for (int k = 0; k < count; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            result[k] = sumArr[j-1] - sumArr[i-1];
        }

        for (int k = 0; k < count; k++) {
            System.out.println(result[k]);
        }
    }
}
