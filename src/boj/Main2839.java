package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
최소 봉지 출력
 */
public class Main2839 {

  public int BFS(int n) {
    Queue<Integer> Q = new LinkedList<>();
    Q.offer(n);

    int cnt = 0;
    while (!Q.isEmpty()) {
      int len = Q.size();
      for (int i = 0; i < len; i++) {
        int x = Q.poll();
        if (x ==0) {
          return cnt;
        }
        if (x - 3 >= 0) {
          Q.offer(x - 3);
        }
        if (x - 5 >= 0) {
          Q.offer(x - 5);
        }
      }
      cnt++;
    }
    return -1;
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Main2839 main = new Main2839();
    System.out.println(main.BFS(n));
  }

}
