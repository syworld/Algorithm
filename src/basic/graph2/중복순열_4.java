package basic.graph2;

import java.util.*;

/*
입력
3 2

출력
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
 */
public class 중복순열_4 {

  static int[] permutationArr;
  static int n, m;

  public void DFS(int L) {
    // D(0) i = 1 -> D(1) i = 1 -> D(2) 1 1 출력 pop
    // D(0) -> D(1) i = 2 -> D(2) 1 2 출력 pop

    if (L == m) { // n개 중에서 중복으로 m개 뽑기
      for (int x : permutationArr) {
        System.out.print(x + " ");
      }
      System.out.println();
    } else {
      for (int i = 1; i <= n; i++) {
        permutationArr[L] = i;
        DFS(L + 1); // n번 호출됨
      }
    }
  }

  public static void main(String[] args) {
    중복순열_4 T = new 중복순열_4();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    permutationArr = new int[m];
    T.DFS(0);
  }

}
