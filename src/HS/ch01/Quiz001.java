package HS.ch01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int i = 0;
        while(i < N) {
            System.out.println("i..."+i);
            arr[i] = sc.nextInt();
            i++;
        }

    }

}
