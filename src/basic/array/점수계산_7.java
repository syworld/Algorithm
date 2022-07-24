package basic.array;

import java.util.Scanner;

public class 점수계산_7 {

  public int solution(int n, int[] arr) {
    int answer = 0, cnt = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        cnt++;
        answer += cnt;
      } else {
        cnt = 0;
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    점수계산_7 T = new 점수계산_7();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, arr));


  }

}
