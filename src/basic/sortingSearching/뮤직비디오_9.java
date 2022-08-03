package basic.sortingSearching;

import java.util.*;

/*
입력
9 3
1 2 3 4 5 6 7 8 9

결과
17

결정 알고리즘 (binary search)
DVD의 최소 용량 크기 => lt ~ rt 사이에 있음이 확신될 때
 */
public class 뮤직비디오_9 {

  public int count(int[] arr, int capacity) {
    int cnt = 1, sum = 0;
    for (int x : arr) {
      if (sum + x > capacity) {
        cnt++;
        sum = x;
      } else {
        sum += x;
      }
    }
    return cnt;
  }

  public int solution(int n, int m, int[] arr) {
    int answer = 0;
    int lt = Arrays.stream(arr).max().getAsInt(); // 최소 용량
    int rt = Arrays.stream(arr).sum(); // 최대 용량

    while (lt <= rt) {
      int mid = (lt + rt) / 2;
      if (count(arr, mid) <= m) {
        answer = mid;
        rt = mid - 1;
      } else {
        lt = mid + 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    뮤직비디오_9 T = new 뮤직비디오_9();
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
