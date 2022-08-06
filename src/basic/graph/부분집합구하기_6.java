package basic.graph;

import java.util.Scanner;

/*
입력
3

결과
123
12
13
1
23
2
3
 */
public class 부분집합구하기_6 {

  static int n;
  static int[] chk;

  public void dfs(int L) {
    // L이 원소를 의미 {1, 2, 3}
    // D(1) D(2) D(3) 사용 o/x

    // D(1) -> D(2) -> D(3) -> D(4) chk = {1,1,1}
    // D(1) -> D(2) -> D(3) -> ch[3] =0 -> D(4) chk = {1,1,0}
    // D(1) -> D(2) -> ch[2] =0 chk = {1,0,0} -> D(3) chk = {1,0,1} -> D(4)
    if (L == n + 1) { // chk 정보 출력하고 pop
      String tmp = "";
      for (int i = 1; i <= n; i++) {
        if (chk[i] == 1) {
          tmp += (i + " ");
        }
      }
      if (tmp.length() > 0) {
        System.out.println(tmp);
      }
//      return;
    } else {
      chk[L] = 1;
      dfs(L + 1); // 사용 o
      chk[L] = 0;
      dfs(L + 1); // 사용 x
    }
  }

  public static void main(String args[]) {
    부분집합구하기_6 T = new 부분집합구하기_6();
    Scanner sc = new Scanner(System.in);
    n = 3;
    chk = new int[n + 1];
    T.dfs(1);
  }

}
