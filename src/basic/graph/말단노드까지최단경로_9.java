package basic.graph;

import java.util.Scanner;

/*
DFS 풀이 (문제 자체는 BFS 문제)
자식 노드가 2개 있어야함
 */
public class 말단노드까지최단경로_9 {
  Node root;

  public int DFS(int L, Node root) {
    // stack frame
    // D(0, 1) -> D(1,2) -> D(2,4) , D(2,5) return 2
    // D(0, 1) -> D(1,2) return 2
    // D(0, 1) -> D(1,2) return 2, D(1,3) return 1
    // D(0, 1) return 1
    if (root.lt == null && root.rt == null) return L; // 말단 노드
    else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
  }

  public static void main(String args[]) {
    말단노드까지최단경로_9 tree = new 말단노드까지최단경로_9();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    System.out.println(tree.DFS(0, tree.root)); // 1
  }

}