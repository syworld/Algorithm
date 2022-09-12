package programmers.dfsBfs;

import java.util.*;

/*
단어변환
 */
public class Solution4 {

  static boolean[] visited;
  static int minCnt = Integer.MAX_VALUE;

  public int solution(String begin, String target, String[] words) {

    visited = new boolean[words.length];

    // target이 배열에 없으면 바로 0 리턴
    if (!Arrays.asList(words).contains(target)) {
      return 0;
    }

    dfs(0, begin, target, words);
    return minCnt;
  }


  public boolean isEqual(String cur, String next) {
    // 단어 하나 제외하고 일치 여부 리턴
    int n = 0;
    for (int i = 0; i < cur.length(); i++) {
      if (cur.charAt(i) != next.charAt(i)) {
        n++;
      }
    }

    return n == 1;
  }


  public void dfs(int cnt, String begin, String target, String[] words) {
    if (begin.equals(target)) {
      minCnt = Math.min(cnt, minCnt);
      return;
    }

    for (int i = 0; i < words.length; i++) {
      if (!visited[i] && isEqual(begin, words[i])) {
        visited[i] = true;
        dfs(cnt + 1, words[i], target, words);
        visited[i] = false;
      }
    }
  }
}