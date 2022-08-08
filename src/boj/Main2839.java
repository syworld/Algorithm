package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
설탕 배달
최소 봉지 출력
 */
public class Main2839 {

  public int BFS(int n) {
    Queue<Integer> Q = new LinkedList<>();
    Q.offer(n);
    HashMap<Integer, Integer> map = new HashMap<>(); // memoization
    map.put(n, 1);

    int cnt = 0;
    while (!Q.isEmpty()) {
      int len = Q.size();
      for (int i = 0; i < len; i++) {
        int x = Q.poll();
        if (x == 0) {
          return cnt;
        }
        if (x - 3 >= 0 && !map.containsKey(x - 3)) {
          Q.offer(x - 3);
          map.put(x - 3, 1);
        }
        if (x - 5 >= 0 && !map.containsKey(x - 5)) {
          Q.offer(x - 5);
          map.put(x - 5, 1);
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
