package basic.graph2;

import java.util.*;

/*
nCr = n-1Cr-1 + n-1Cr

입력
5 3

출력
10
 */
public class 조합수_7 {

  int[][] dy = new int[35][35]; // n <=33

  public int DFS(int n, int r) {
    if (dy[n][r] > 0) { // memoization
      return dy[n][r];
    }
    if (n == r || r == 0) {
      return 1;
    } else {
      return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }
  }

  public static void main(String[] args) {
    조합수_7 T = new 조합수_7();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    System.out.println(T.DFS(n, r));
  }

}
