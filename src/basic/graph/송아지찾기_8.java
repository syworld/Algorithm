package basic.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
BFS
최초 발견 => 최단 거리 찾기 알고리즘

한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하기

입력
5 14

결과
3
 */
public class 송아지찾기_8 {

  int[] dis = {1, -1, 5};
  int[] chk; // 이전 레벨에서 방문한 곳은 다시 방문안함

  public int BFS(int s, int e) {
    // 레벨이 점프 횟수
    // (5) -> +1, -1, +5
    Queue<Integer> Q = new LinkedList<>();
    chk = new int[10001]; // 최대 10000까지 좌표 구성
    chk[s] = 1;
    Q.offer(s);
    int L = 0;

    while (!Q.isEmpty()) {
      int len = Q.size();

      for (int i = 0; i < len; i++) {
        int x = Q.poll();
        // if (x==e) return L;
        for (int j = 0; j < 3; j++) {
          int nx = x + dis[j];
          if (nx == e) {  //Q에 넣기전에 답 확인해서 리턴하는게 효율성이 더 좋음
            return L + 1;
          }
          if (nx >= 1 && nx <= 10000 && chk[nx] == 0) {
            chk[nx] = 1;
            Q.offer(nx);
          }
        }
      }

      L++;
    }
    return 0;
  }

  public static void main(String args[]) {
    송아지찾기_8 T = new 송아지찾기_8();
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int e = sc.nextInt();
    System.out.println(T.BFS(s, e));
  }
}