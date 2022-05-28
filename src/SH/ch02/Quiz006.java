package SH.ch02;

import java.io.IOException;
import java.util.Scanner;

public class Quiz006 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (end != N) {
            if(sum == N) {
                count++;
                end++;
                sum += end;
                System.out.println(end);
            } else if(sum > N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }
        System.out.println(count);
    }
}
