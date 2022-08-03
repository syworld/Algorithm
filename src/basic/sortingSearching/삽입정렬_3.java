package basic.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;
/*
O(N) ~ O(N^2)
 */
public class 삽입정렬_3 {

  public int[] solution(int n, int[] arr) {
    for (int i = 1; i < n; i++) {
      int tmp = arr[i], j; // j 선언 위치

      // j 가 0~ i-1 까지 돌면서 정렬된 상태로 만듬
      for (j = i - 1; j >= 0; j--) {
        if (arr[j] > tmp) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }
      }
      // j 가 멈춘 지점 + 1 에 넣음
      arr[j + 1] = tmp;

      System.out.println(Arrays.toString(arr));
    }
    return arr;
  }

  public static void main(String[] args) {
    삽입정렬_3 T = new 삽입정렬_3();
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
