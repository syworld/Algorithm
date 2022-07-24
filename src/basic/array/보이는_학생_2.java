package basic.array;

import java.util.*;

public class 보이는_학생_2 {

  public int solution(int[] arr) {
    int answer = 1, max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    보이는_학생_2 C = new 보이는_학생_2();
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println(C.solution(arr));

  }

}
