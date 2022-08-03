package basic.sortingSearching;

import java.util.Scanner;

/*
O(N^2)
 */
public class 버블정렬_2 {

  public int[] solution(int n, int[] arr) {
    // 이웃한 수 2개를 비교해서 swap -> 가장 큰 숫자가 뒤로감 (1 turn)
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    버블정렬_2 T = new 버블정렬_2();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }

}
