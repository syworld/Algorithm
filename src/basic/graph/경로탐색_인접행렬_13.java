package basic.graph;

import java.util.*;

/*
경로탐색 - 인접행렬
방향 그래프, 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수 출력
 */
public class 경로탐색_인접행렬_13 {

  static int n, m, answer = 0;
  static int[][] graph;
  static int[] ch;

  public void DFS(int v) {
    if (v == n) {
      answer++;
    } else {
      for (int i = 1; i <= n; i++) {
        if (graph[v][i] == 1 && ch[i] == 0) { // 1번 노드부터 ~ n번 노드까지
          ch[i] = 1;
          DFS(i);
          ch[i] = 0; // 백 트래킹
        }
      }
    }
  }

  public static void main(String[] args) {
    경로탐색_인접행렬_13 T = new 경로탐색_인접행렬_13();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    graph = new int[n + 1][n + 1];
    ch = new int[n + 1];
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph[a][b] = 1;
    }
    ch[1] = 1; // 1번 노드 방문
    T.DFS(1);
    System.out.println(answer);
  }

}
