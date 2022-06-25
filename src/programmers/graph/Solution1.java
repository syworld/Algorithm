package programmers.graph;
/*
가장 먼 노드 - graph
노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때,
1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 반환
 */

import java.util.*;

public class Solution1 {

  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch, dis;


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

  public int solution(int n, int[][] edge) {
    int answer = 0;
    ch = new int[n + 1];
    dis = new int[n + 1];
    graph = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<Integer>());
    }

    // 방향 그래프를 인접리스트로 생성
    for (int[] e : edge) {
      graph.get(e[0]).add(e[1]);
      graph.get(e[1]).add(e[0]);
    }

    BFS(1);

    // 최댓값 구하기
    Arrays.sort(dis);
    int maxdis = dis[dis.length - 1];

    for (int i = dis.length - 1; i >= 0; i--) {
      if (dis[i] == maxdis) {
        answer++;
      } else {
        break;
      }
    }

    return answer;
  }
}