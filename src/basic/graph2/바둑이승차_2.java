package basic.graph2;

import java.util.Scanner;

/*
C를 넘지 않으면서 가장 무거운 무게 구하기
 */
public class 바둑이승차_2 {

  static int answer = Integer.MIN_VALUE;
  static int c, n;

  public void DFS(int L, int sum, int[] arr) {
    // sum : 트럭에 타는 바둑의 합. 부분집합의 합
    if (sum > c) {
      return;
    }
    if (L == n) { // sum<=c 인 부분집합
      answer = Math.max(answer, sum);
    } else {
      DFS(L + 1, sum + arr[L], arr);
      DFS(L + 1, sum, arr);
    }
  }

  public static void main(String[] args) {
    바둑이승차_2 T = new 바둑이승차_2();
    Scanner sc = new Scanner(System.in);
    c = sc.nextInt();
    n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    T.DFS(0, 0, arr);
    System.out.println(answer);
  }

}
