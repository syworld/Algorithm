package basic.graph;

public class 팩토리얼_3 {

  public int DFS(int n) {
    // D(5) -> 5*D(4) -> 4*D(3) -> 3*D(2) -> 2*D(1) -> 2*1
    if (n == 1) {
      return 1;
    } else {
      return n * DFS(n - 1);
    }
  }

  public static void main(String[] args) {
    팩토리얼_3 T = new 팩토리얼_3();
    System.out.println(T.DFS(5));
  }

}
