package SH.ch02;

import java.util.Scanner;

public class Quiz002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        double max = 0;
        double sum = 0;
        for(int i = 0; i < num; i++) {
            int score = scanner.nextInt();
            if(score > max) {
                max = score;
            }
            sum += score;
        }
        double avg = sum / max * 100 / num;
        System.out.println(avg);
    }
}
