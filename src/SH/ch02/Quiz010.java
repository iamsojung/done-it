package SH.ch02;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Quiz010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Deque<Node> mydepue = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while(!mydepue.isEmpty() && mydepue.getLast().value > now) {
                mydepue.removeLast();
            }
            mydepue.addLast(new Node(now, i));
            if(mydepue.getFirst().index <= i - L) {
                mydepue.removeFirst();
            }
            bw.write(mydepue.getFirst().value + "");
        }
        bw.flush();
        bw.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
