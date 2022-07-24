package basic.array;

import java.util.Scanner;

public class 격자판_최대합_9 {

  public int maxSum(int[][] g, int n) {

    // 행렬
    int max = Integer.MIN_VALUE;
    int s1, s2;
    for (int i = 0; i < n; i++) {
      s1 = s2 = 0;
      for (int j = 0; j < n; j++) {
        s1 += g[i][j];
        s2 += g[j][i];
      }
      max = Math.max(max, s1);
      max = Math.max(max, s2);
    }

    // 대각선
    s1 = s2 = 0;
    for (int i = 0; i < n; i++) {
      s1 += g[i][i];
      s2 += g[i][n - 1 - i];
    }
    max = Math.max(max, s1);
    max = Math.max(max, s2);

    return max;
  }

  public static void main(String[] args) {
    격자판_최대합_9 T = new 격자판_최대합_9();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] g = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        g[i][j] = sc.nextInt();
      }
    }
    System.out.println(T.maxSum(g, n));
  }

}
