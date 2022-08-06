package basic.graph;

/*
순회는 부모가 기준
부왼오: 전위순회
왼부오: 중위순회
왼오부: 후위순회 -> 병합 정렬 구현
 */
class Node {

  int data;
  Node lt, rt;

  public Node(int val) {
    data = val;
    lt = rt = null;
  }
}

public class 이진트리순회_5 {

  Node root;

  public void DFS(Node root) {
    // D(1) -> D(2) -> D(4) -> null pop -> 4 출력 -> null pop -> D(4) pop
    // D(1) -> D(2)
    // D(1) -> D(2) -> 2 출력 -> D(5) -> null pop -> 5 출력 -> null pop -> D(5) pop
    // D(1) -> D(2) pop
    // D(1) -> 1 출력 -> D(3)
    if (root == null) {
      return;
    } else {
      // 부왼오
      DFS(root.lt);
      System.out.print(root.data + " "); //4 2 5 1 6 3 7 왼부오
      DFS(root.rt);
      // 왼오부
    }
  }

  public static void main(String args[]) {
    이진트리순회_5 tree = new 이진트리순회_5();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.DFS(tree.root);
  }
}