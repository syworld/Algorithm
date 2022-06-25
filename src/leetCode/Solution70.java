package leetCode;

public class Solution70 {
  /*
  DP
  1) basic
  2) memory space
  3) memoization
   */

  public int climbStairs_dp(int n) {
    int[] fibo = new int[n + 1];

    fibo[0] = 1;
    fibo[1] = 1;

    for (int i = 3; i <= n; i++) {
      fibo[i] = fibo[i - 1] + fibo[i - 2];
    }

    return fibo[n];

  }

  public int climbStairs_dp_memory(int n) {
    int prev = 1, prevPrev = 1;
    int result = 0;

    if (n <= 1) {
      return 1;
    }

    for (int i = 2; i <= n; i++) {
      result = prev + prevPrev;
      prevPrev = prev;
      prev = result;
    }

    return result;

  }

  // memoization
  Integer[] mem;

  public int climbStairs_memoization(int n) {
    mem = new Integer[n + 1];
    return find(n);
  }

  private int find(int n) {
    if (n <= 1) {
      return 1;
    }

    if (mem[n] == null) {
      mem[n] = find(n - 1) + find(n - 2);
    }

    return mem[n];
  }

}