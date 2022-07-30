package basic.twopointersSlidingwindow;

import java.util.Scanner;

/*
0과 1로 구성된 수열에서 최대 연속 1 길이

입력 N, K(5<=N<100,000)
14 2
1 1 0 0 1 1 0 1 1 0 1 1 0 1

결과
8
1 1 0 0 1 1 1 1 1 1 1 1 0 1
 */
public class 최대_길이_연속부분수열_6 {

  public int solution(int n, int k, int[] arr) {
    int answer = 0, cnt = 0, lt = 0;
    // cnt: 0을 1로 바꾼 횟수
    // 길이: rt - lt +1

    for (int rt = 0; rt < n; rt++) {
      if (arr[rt] == 0) {
        cnt++; //  0->1 로 바꾸고, cnt <= k 면 +1
      }
      while (cnt > k) { // rt가 0을 1로 바꾼 처음 지점으로 lt가 이동
        if (arr[lt] == 0) {
          cnt--;
        }
        lt++;
      }
      answer = Math.max(answer, rt - lt + 1);
    }
    return answer;
  }

  public static void main(String[] args) {
    최대_길이_연속부분수열_6 T = new 최대_길이_연속부분수열_6();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(n, k, arr));
  }


}
