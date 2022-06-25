package programmers.binarySearch;

import java.util.*;

/*
입국심사 - 이분 탐색
입국심사를 기다리는 사람 수 n, 각 심사관이 한 명을 심사하는데 걸리는 시간이 담긴 배열 times가 매개변수로 주어질 때,
모든 사람이 심사를 받는데 걸리는 시간의 최솟값을 return
 */
public class Solution1 {

  public long solution(int n, int[] times) {
    Arrays.sort(times);
    long l = 0; // min value
    long r = (long) times[times.length - 1] * (long) n; // max value

    while (l < r) {
      long m = l + (r - l) / 2;
      if (condition(m, n, times)) {
        r = m;
      } else {
        l = m + 1;
      }
    }
    // condition을 만족하는 min index 리턴
    return l;
  }

  private boolean condition(long m, int n, int[] times) {
    // m분에 모든 인원 조사 가능 여부
    long tmpCnt = 0;
    for (int time : times) {
      tmpCnt += m / time;
    }
    // 시간 더 필요
    return tmpCnt >= n;
  }
}
