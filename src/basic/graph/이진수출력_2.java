package basic.graph;
/*
11 -> 1011
 */
public class 이진수출력_2 {

  public void DFS(int n) {
    // D(11) -> D(5) -> D(2) -> D(1) -> D(0)
    // stack 상단이 작동!
    if (n == 0) {
      return;
    } else {
      DFS(n / 2);
      System.out.print(n % 2);
    }
  }

  public static void main(String[] args) {
    이진수출력_2 T = new 이진수출력_2();
    T.DFS(11);
  }
}
