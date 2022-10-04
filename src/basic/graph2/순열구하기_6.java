package basic.graph2;

import java.util.*;

/*
입력
3 2 : 3개 중에 2개 뽑기
3 6 9

출력
3 6
3 9
6 3
6 9
9 3
9 6
 */
public class 순열구하기_6 {

  static int[] pm, ch, arr;
  static int n, m;

  public void DFS(int L) {
    // D(0) -> D(1) -> D(2) ch [ 1, 1 ,0 ]: 3 6 출력
    // D(0) -> D(1) -> D(2) ch [ 1, 0 ,1 ]: 3 9 출력
    // ch [ 1, 0 ,0 ] -> ch [ 0, 0 ,0 ] -> ch [ 0, 1 ,0 ]
    // D(0) -> D(1) -> D(2) ch [ 1, 1 ,0 ] : 6 3 출력
    if (L == m) {
      for (int x : pm) {
        System.out.print(x + " ");
      }
      System.out.println();
    } else {
      for (int i = 0; i < n; i++) {
        if (ch[i] == 0) { // 숫자 사용안했으면 사용
          ch[i] = 1;
          pm[L] = arr[i];
          DFS(L + 1);
          ch[i] = 0; // 숫자 사용 해제
        }
      }
    }
  }

  public static void main(String[] args) {
    순열구하기_6 T = new 순열구하기_6();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();

    arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    ch = new int[n]; // 숫자 사용 여부 체크
    pm = new int[m]; // 순열
    T.DFS(0);
  }

}
