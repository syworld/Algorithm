/*
타겟넘버 - dfs
 */
public class Solution1 {

  private static int cnt;


  private void dfs(int n, int sumNumbers, int target, int[] numbers) {

    if (n == numbers.length) {
      if (sumNumbers == target) {
        cnt += 1;
      }
      return;
    }

    dfs(n + 1, sumNumbers + numbers[n], target, numbers);
    dfs(n + 1, sumNumbers - numbers[n], target, numbers);

  }

  public int solution(int[] numbers, int target) {
    // 전역 변수 초기화
    cnt = 0;
    dfs(0, 0, target, numbers);
    return cnt;
  }

}
