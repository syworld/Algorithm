package basic.graph;

/*
재귀함수로 출력
3
1 2 3
 */
public class 재귀함수_1 {

  public void DFS(int n) {
    // 매개변수 지역변수 복귀주소 (stack frame에 저장됨)
    // D(3) -> D(2) -> D(1) -> D(0)
    if (n == 0) {
      return;
    } else {
//      System.out.println(n); // 3 2 1
      DFS(n - 1);
      System.out.println(n); // 1 2 3
    }
  }

  public static void main(String[] args) {
    재귀함수_1 T = new 재귀함수_1();
    T.DFS(3);
  }

}
