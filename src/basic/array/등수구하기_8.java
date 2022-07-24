package basic.array;

import java.util.*;
import java.util.stream.Collectors;

/*
입력
5
87 89 92 100 100

결과
5 4 3 1 1
 */
public class 등수구하기_8 {

  private static int[] solution(int[] arr) {
    int[] grade = new int[arr.length];
    List<Integer> sortedArr = Arrays.stream(arr)
        .boxed()
        .sorted(Collections.reverseOrder())
        .collect(Collectors.toList());

    for (int i = 0; i < grade.length; i++) {
      grade[i] = sortedArr.indexOf(arr[i]) + 1;
    }

    return grade;
  }

  public static void main(String[] args) {
    등수구하기_8 T = new 등수구하기_8();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.print(solution(arr)[i] + " ");
    }
  }

}
