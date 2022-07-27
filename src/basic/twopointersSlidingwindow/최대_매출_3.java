package basic.twopointersSlidingwindow;

import java.util.Scanner;

/*
N(5<=N<=100,000) K(2<=K<=N)
O(N) solution by sliding window
 */
public class 최대_매출_3 {

  public int solution(int n, int k, int[] arr) {
    int res, sum = 0;
    // 미리 앞에 k개 원소의 합을 구한다
    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    res = sum;

    // 앞에 k 개 새로 더해주고, 이전꺼 빼준다. 한 칸씩 이동
    for (int i = k; i < n; i++) {
      sum += (arr[i] - arr[i - k]);
      res = Math.max(res, sum);
    }
    return res;
  }

  public static void main(String[] args) {
    최대_매출_3 T = new 최대_매출_3();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(T.solution(n, k, arr));
  }

}
