package basic.sortingSearching;

import java.io.IOException;
import java.util.Scanner;
/*
O(N^2)
 */
public class 선택정렬_1 {

  public int[] solution(int n, int[] arr) {
    // i 번째와 j 바퀴돌면서 가장 작은 값을 i번째로 swap
    for (int i = 0; i < n - 1; i++) { // 마지막 idx 바로 전까지만 확인
      int idx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[idx]) {
          idx = j;
        }
      }

      //i번째 값 swap
      int tmp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = tmp;
    }
    return arr;
  }

  public static void main(String[] args) throws IOException {
    선택정렬_1 T = new 선택정렬_1();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }

}
