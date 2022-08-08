package basic.graph;

import java.util.LinkedList;
import java.util.Queue;

/*
BFS 풀이
최단 경로
 */
public class 말단노드까지최단경로_10 {
  Node root;

  public int BFS(Node root) {
    Queue<Node> Q = new LinkedList<>();
    Q.offer(root);

    int L = 0;
    while (!Q.isEmpty()) {
      int len = Q.size();
      for (int i = 0; i < len; i++) { // 하나의 레벨 탐색
        Node cur = Q.poll();
        if (cur.lt == null && cur.rt == null) return L;
        if (cur.lt != null) Q.offer(cur.lt);
        if (cur.rt != null) Q.offer(cur.rt);
      }
      L++; // 레벨 +1
    }
    return 0;
  }

  public static void main(String args[]) {
    말단노드까지최단경로_10 tree = new 말단노드까지최단경로_10();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    System.out.println(tree.BFS(tree.root)); // 1
  }

}