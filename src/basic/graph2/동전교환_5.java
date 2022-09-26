package basic.graph2;

import java.util.*;

/*
특정 금액을 만들 수 있는 최소 동전의 개수 구하기

입력
3
1 2 5
15

출력
3
 */
public class 동전교환_5 {

  static int n, m, minCnt = Integer.MAX_VALUE;

  public void DFS(int L, int sum, Integer[] arr) { // L : 동전의 개수 sum: 동전의 총합
    if (sum > m) { // cut edge
      return;
    }
    if (L >= minCnt) { // cut edge
      return;
    }

    if (sum == m) { // 답 추출
      minCnt = Math.min(minCnt, L);
    } else {
      for (int i = 0; i < n; i++) { // 동전의 개수만큼 DFS 호출
        DFS(L + 1, sum + arr[i], arr);
      }
    }
  }

  public static void main(String[] args) {
    동전교환_5 T = new 동전교환_5();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    Integer[] arr = new Integer[n]; // reverseOrder를 위해 객체형으로 선언
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr, Collections.reverseOrder()); // 큰 금액부터 적용해서 tree depth가 깊어지지 않도록 설정
    m = sc.nextInt();

    T.DFS(0, 0, arr);
    System.out.println(minCnt);
  }

}
