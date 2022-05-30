package SJ.ch02;

import java.util.Scanner;

/*
* 문제링크 : https://www.acmicpc.net/problem/11720
* 제목 : 숫자의 합
*/
public class Q001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // char형의 값을 정수형으로 변환하여, sum에다가 더해줌.
        }
        System.out.print(sum);
    }
}
