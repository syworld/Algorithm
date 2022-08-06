package basic.graph;

/*
BFS 레벨 탐색
LEVEL= 0 : 1
LEVEL= 1 : 23
LEVEL= 2 : 4567
레벨 = 몇 번만에 찾냐 
 */

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리순회_7 {

  Node root;

  public void BFS(Node root) {
    // 1 poll - 2 - 3 offer
    // 2 poll - 4 - 5 offer
    // 3 poll - 6 - 7 offer
    Queue<Node> Q = new LinkedList<>();
    Q.offer(root);
    int L = 0;

    while (!Q.isEmpty()) {
      int len = Q.size();
      System.out.print("LEVEL= " + L + " : ");
      for (int i = 0; i < len; i++) {
        // 자신 poll
        Node current = Q.poll();
        System.out.print(current.data);

        // 왼 오 데이터 offer
        if (current.lt != null) {
          Q.offer(current.lt);
        }
        if (current.rt != null) {
          Q.offer(current.rt);
        }
      }
      L++; // 레벨 증가
      System.out.println();
    }
  }

  public static void main(String args[]) {
    이진트리순회_7 tree = new 이진트리순회_7();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.BFS(tree.root);
  }
}