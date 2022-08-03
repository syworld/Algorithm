package basic.sortingSearching;

import java.util.*;

/*
1) HashMap
2) 정렬 O(NlogN)
 */
public class 중복확인_5 {

  public String solution(int n, int[] arr) {
    String answer = "U";
    Arrays.sort(arr);
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] == arr[i + 1]) {
        answer = "D";
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    중복확인_5 T = new 중복확인_5();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, arr));
  }
}
