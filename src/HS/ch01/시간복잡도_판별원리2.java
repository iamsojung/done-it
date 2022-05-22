package HS.ch01;

public class 시간복잡도_판별원리2 {
    public static void main(String[] args) {
        int N = 100000;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수 : " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수 : " + cnt++);
        }
        for (int i = 0; i < N; i++) {
            System.out.println("연산 횟수 : " + cnt++);
        }
        // 1번과 시간복잡도는 O(n)으로 같다.
    }
}
