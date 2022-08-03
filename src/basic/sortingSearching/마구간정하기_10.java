package basic.sortingSearching;

import java.util.*;

/*
5 3
1 2 8 4 9

가장 가까운 두 말의 최대 거리 : lt ~ rt
3
 */
public class 마구간정하기_10 {

  public int count(int[] arr, int dist) {
    int cnt = 1; // 1마리 배치, 제일 왼쪽 좌표에 배치
    int ep = arr[0]; // 바로 전 말의 위치

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] - ep >= dist) {
        cnt++;
        ep = arr[i];
      }
    }
    return cnt; // 배치된 말의 개수
  }

  public int solution(int n, int c, int[] arr) {
    int answer = 0;
    Arrays.sort(arr);
    int lt = 1; // 최소 거리 1
    int rt = arr[n - 1]; // 최대 거리

    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (count(arr, mid) >= c) { // 말의 개수보다 크면 더 크게 잡음
        answer = mid;
        lt = mid + 1;
      } else { // 말의 개수보다 작으면 더 작게 잡음
        rt = mid - 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    마구간정하기_10 T = new 마구간정하기_10();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, c, arr));
  }


}
