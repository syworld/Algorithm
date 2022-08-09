package basic.graph2;

import java.util.Scanner;

public class 합이같은부분집합_1 {

  static String answer = "NO";

  static int n, total = 0;
  boolean flag = false; // 리턴 신호 변수

  public void DFS(int L, int sum, int[] arr) {
    // arr 원소 크기까지 넣거나 넣지 않고 (o/x) 합 비교
    // D(0, 0) -> D(1, arr[0]) -> D(2, arr[0] + arr[1])  ...
    if (flag) {
      return;
    }
    if (sum > total / 2) {
      return;
    }
    if (L == n) {
      if ((total - sum) == sum) {
        answer = "YES";
        flag = true;
      }
    } else {
      DFS(L + 1, sum + arr[L], arr);
      DFS(L + 1, sum, arr);
    }
  }

  public static void main(String[] args) {
    합이같은부분집합_1 T = new 합이같은부분집합_1();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      total += arr[i];
    }
    T.DFS(0, 0, arr);
    System.out.println(answer);
  }

}
