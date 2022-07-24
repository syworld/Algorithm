package basic.array;

import java.util.Scanner;

/*
입력
5
23173
41968
55244
65267
84222

결과
4
 */
public class 임시반장_정하기_11 {

  public int solution(int n, int[][] arr) {
    int max = Integer.MIN_VALUE;
    int id = 0;
    for (int i = 0; i < n; i++) {
      int cnt = 0;
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            cnt++;
            break; //중요. 같은 사람은 다시 카운트 X
          }
        }
      }
      if (cnt > max) {
        max = cnt;
        id = i + 1;
      }
    }
    return id;
  }

  public static void main(String[] args) {
    임시반장_정하기_11 T = new 임시반장_정하기_11();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] g = new int[n][5];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        g[i][j] = sc.nextInt();
      }
    }
    System.out.println(T.solution(n, g));
  }

}
