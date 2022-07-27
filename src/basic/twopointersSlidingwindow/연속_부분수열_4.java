package basic.twopointersSlidingwindow;

import java.util.Scanner;

/*
8 6 N(1≤N≤100,000), M(1≤M≤100,000,000)
12131112
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지
이중 for문 O(N^2) 이면 10만 * 10만
O(N)으로 풀어야 한다.
 */
public class 연속_부분수열_4 {

  public int solution(int n, int m, int[] arr) {
    int answer = 0, sum = 0, lt = 0;
    // sum = lt~rt까지의 연속 합
    for (int rt = 0; rt < n; rt++) {
      // rt가 증가하고, 더하고, 비교
      sum += arr[rt];
      if (sum == m) {
        answer++;
      }
      while (sum >= m) {
        // lt를 빼고, 증가하고, 비교
        sum -= arr[lt++];
        if (sum == m) {
          answer++;
        }
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    연속_부분수열_4 T = new 연속_부분수열_4();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(T.solution(n, m, arr));
  }

}
