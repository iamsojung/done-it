package SH.ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        Long[] A = new Long[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < N; i++) {
            A[i] = Long.parseLong(stringTokenizer.nextToken());
        }

        Arrays.sort(A);

        for(int k = 0; k < N; k++) {
            long K = A[k];
            int i = 0;
            int j = N - 1;

            while (i < j) {
                if(A[i] + A[j] == K) {
                    // 조건문은 추가로 왜 건거지?
                    // 이해가 안되는게
                    // 어처피 정수는 1보다 큰 조건인데 i든 j든 k랑 인덱스가 같아봤자
                    // 하 좀 더 생각해본 결과
                    // N의 갯수가 1개 이상인거지 값이 0이 안나올수가 없는 조건
                    // K = 3일때 A[i] = 0, A[j] = 3 본인은 제외해야하므로 이 조건이 필수적으로 필요함.
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        System.out.println(i + " : " + k);
                        i++;
                    } else if (j == k) {
                        System.out.println(j + " : " + k);
                        j--;
                    }
                } else if (A[i] + A[j] < K) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        System.out.println(count);
        bufferedReader.close();
    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(A);

        int count = 0;
        int i = 0;
        int j = N - 2;
        while (i < j) {
            if(A[i] + A[j] > N) {
                j--;
            } else if(A[i] + A[j] < N) {
                i++;
            } else {
                count += 2;
                i++;
                j--;
            }
        }

        System.out.println(count);
        bufferedReader.close();
    }*/
}
