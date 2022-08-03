package basic.sortingSearching;

import java.util.Scanner;

/*
삽입 정렬 알고리즘으로 LRU 구현
 */
public class LRU_4 {

  public int[] solution(int size, int n, int[] arr) {
    int[] cache = new int[size];
    for (int x : arr) {
      int pos = -1; // 위치

      for (int i = 0; i < size; i++) {
        // cache hit
        if (x == cache[i]) {
          pos = i;
        }
      }

      // 땡기기 작업
      if (pos == -1) {
        // cache miss 한 칸씩 땡기기
        for (int i = size - 1; i >= 1; i--) {
          cache[i] = cache[i - 1];
        }
      } else {
        // cache hit : hit 난 지점부터 땡기기
        for (int i = pos; i >= 1; i--) {
          cache[i] = cache[i - 1];
        }
      }
      // 가장 최근에 사용한 값 0번 인덱스에 넣기
      cache[0] = x;
    }
    return cache;
  }

  public static void main(String[] args) {
    LRU_4 T = new LRU_4();
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int x : T.solution(s, n, arr)) {
      System.out.print(x + " ");
    }
  }
}
