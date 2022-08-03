package basic.sortingSearching;

import java.util.*;

/*
Binary Search 알고리즘
O(logN)
 */
public class 이분검색_8 {

  public int solution(int n, int m, int[] arr) {
    int answer = 0;
    Arrays.sort(arr);

    // 이분 검색은 정렬된 상태에서 검색
    int lt = 0, rt = n - 1;
    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (arr[mid] == m) {
        answer = mid + 1;
        break;
      }
      if (arr[mid] > m) {
        rt = mid - 1;
      } else {
        lt = mid + 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    이분검색_8 T = new 이분검색_8();
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
