package basic.graph2;

import java.util.*;

/*
입력
n m : m 시간 내에 n개의 문제 풀기
5 20
점수 푸는데 걸리는 시간
10 5
25 12
15 8
6 3
7 4

출력
41
 */
public class 최대점수구하기_3 {

  static int answer = Integer.MIN_VALUE, n, m;

  public void DFS(int L, int sum, int time, int[] arrSum, int[] arrTime) {
    // 풀거나 풀지 않거나 -> 부분 집합
    if (time > m) { // 부분 집합 생성 불가능
      return;
    }
    if (L == n) {
      answer = Math.max(answer, sum);
    } else {
      DFS(L + 1, sum + arrSum[L], time + arrTime[L], arrSum, arrTime);
      DFS(L + 1, sum, time, arrSum, arrTime);
    }
  }

  public static void main(String[] args) {
    최대점수구하기_3 T = new 최대점수구하기_3();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    int[] score = new int[n];
    int[] time = new int[n];
    for (int i = 0; i < n; i++) {
      score[i] = sc.nextInt();
      time[i] = sc.nextInt();
    }
    T.DFS(0, 0, 0, score, time);
    System.out.println(answer);
  }

}
