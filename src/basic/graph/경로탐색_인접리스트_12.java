package basic.graph;

import java.util.*;
/*
정점이 많아지면 -> 인접 행렬은 메모리 크기 커짐
100개면 -> 100번 for 문

인접리스트를 쓰자
1번 노드의 인접리스트에서 방문 여부만 체크하면됨
 */
public class 경로탐색_인접리스트_12 {

  static int n, m, answer = 0;
  static ArrayList<ArrayList<Integer>> graph;
  static int[] ch;

  public void DFS(int v) {
    if (v == n) {
      answer++;
    } else {
      for (int nv : graph.get(v)) { // v번 ArrayList의 원소들
        if (ch[nv] == 0) { // 방문 여부만 체크
          ch[nv] = 1;
          DFS(nv);
          ch[nv] = 0;
        }
      }
    }
  }

  public static void main(String[] args) {
    경로탐색_인접리스트_12 T = new 경로탐색_인접리스트_12();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();

    // 인접리스트 생성
    graph = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i <= n; i++) {
      graph.add(new ArrayList<Integer>()); // graph.get(idx) 0번부터 생성됨
    }
    ch = new int[n + 1];
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      graph.get(a).add(b); //a번 ArrayList에 b를 넣음
    }


    ch[1] = 1;
    T.DFS(1);
    System.out.println(answer);
  }

}
