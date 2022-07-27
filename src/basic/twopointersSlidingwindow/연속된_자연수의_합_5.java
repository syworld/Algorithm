package basic.twopointersSlidingwindow;

import java.util.Scanner;

public class 연속된_자연수의_합_5 {

  // sol1) two-pointers
  public int solution(int n) {
    int answer = 0, sum = 0, lt = 0;
    int m = n / 2 + 1; // 절반 이상이면 합하면 무조건 n 이상
    // sum = lt~rt까지의 연속 합
    int[] num = new int[m];
    for (int i = 0; i < m; i++) {
      num[i] = i + 1;
    }

    for (int rt = 0; rt < m; rt++) {
      // rt가 증가하고, 더하고, 비교
      sum += num[rt];
      if (sum == n) {
        answer++;
      }
      while (sum >= n) {
        // lt를 빼고, 증가하고, 비교
        sum -= num[lt++];
        if (sum == n) {
          answer++;
        }
      }
    }
    return answer;
  }

  // sol2) 수학적 접근
  public int solution2(int n) {
    // 연속된 k개의 숫자를 n에서 미리 빼놓고, n이 k로 나눴을 때 나눠지면 정답
    // 1 2 3 |  15- 6/ 3 | o
    // 1 2 3 4 | 15-10/4 | x
    // 1 2 3 4 5 | 0/4 | o

    int answer = 0, cnt = 1; // cnt: 연속된 자연수의 갯수
    n--;
    while (n > 0) {
      cnt++;
      n = n - cnt;
      if (n % cnt == 0) {
        answer++;
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    연속된_자연수의_합_5 T = new 연속된_자연수의_합_5();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(T.solution(n));
  }

}
