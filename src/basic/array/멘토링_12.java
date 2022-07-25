package basic.array;

import java.util.Scanner;

/*
입력
4 3
3412
4321
3142

결과
3
(3, 1), (3, 2), (4, 2)
 */
public class 멘토링_12 {

  public int solution(int n, int m, int[][] arr) {
    int answer = 0;
    for (int i = 1; i <= n; i++) { //학생 번호
      for (int j = 1; j <= n; j++) { //학생 번호
        // (i, j) 가 멘토 멘티될 수 있는지 확인
        int cnt = 0;
        for (int k = 0; k < m; k++) { /// 테스트
          int pi = 0, pj = 0;
          for (int s = 0; s < n; s++) {
            if (arr[k][s] == i) {
              pi = s;
            }
            if (arr[k][s] == j) {
              pj = s;
            }
          }
          if (pi < pj) {
            cnt++;
          }
        }
        if (cnt == m) {
          answer++;
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    멘토링_12 T = new 멘토링_12();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println(T.solution(n, m, arr));
  }

}
