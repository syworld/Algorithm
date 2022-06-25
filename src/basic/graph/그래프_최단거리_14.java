package basic.graph;

/*
그래프 최단거리 - BFS
BFS는 돌아가지 않음. 최단 거리면 return함

1차원은 Level로 푸는 것도 가능하지만, 2차원은 배열 만들어서 풀자.
dis = [0, 3, 1, 1, 2, 2]
dis[nv] = dis[v] + 1
 */

import java.util.*;

public class 그래프_최단거리_14 {

  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch, dis;
  static int n, m;


  public void BFS(int v) {
    Queue<Integer> queue = new LinkedList<>();
    ch[v] = 1;
    dis[v] = 0;
    queue.offer(v);
    while (!queue.isEmpty()) {
      int currentVertex = queue.poll();
      // 인접리스트 탐색
      for (int nv : graph.get(currentVertex)) {
        if (ch[nv] == 0) { // 현재 정점에서 갈 수 있는 정점 중에서 방문 안한 정점만 체크
          ch[nv] = 1;
          queue.offer(nv);
          dis[nv] = dis[currentVertex] + 1; // 중요
        }
      }
    }


  }


  public static void main(String args[]) {
    그래프_최단거리_14 T = new 그래프_최단거리_14();
    Scanner sc = new Scanner(System.in);

    // 전역 변수 초기화
    n = sc.nextInt();
    m = sc.nextInt();
    ch = new int[n + 1];
    dis = new int[n + 1];
    graph = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<Integer>());
    }

    // 방향 그래프를 인접리스트로 생성
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph.get(a).add(b);
    }

    T.BFS(1); // 1번 정점에서 각 정점으로 가는 최소 이동 거리인 dis 만듦

    // 결과 출력
    for (int i = 2; i <= n; i++) {
      System.out.println(i + ": " + dis[i]);
    }


  }

}
