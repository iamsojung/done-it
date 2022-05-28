package SH.ch02;

import java.util.Scanner;

public class Quiz001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String str = scanner.next();

        int sum = 0;
        for (char c: str.toCharArray()) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}
