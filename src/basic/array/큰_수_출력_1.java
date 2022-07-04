package basic.array;

/**
 * 큰 수 출력
 * 7
 * 4 6 2 21 4 56 5
 * 4 6 21 56
 */

import java.util.*;

public class 큰_수_출력_1 {

  public ArrayList<Integer> solution(int[] arr, int n) {
    ArrayList<Integer> answer = new ArrayList<>();
    answer.add(arr[0]);

    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[i - 1]) {
        answer.add(arr[i]);
      }
    }

    return answer;
  }


  public static void main(String[] args) {
    큰_수_출력_1 bigNumber = new 큰_수_출력_1();
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    for (int x : bigNumber.solution(arr, n)) {
      System.out.print(x + " ");
    }
  }
}