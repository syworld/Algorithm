package programmers.dfsBfs;
/*
게임 맵 최단거리: 1으로만 이루어진 경로 찾아서 가장 최솟값 리턴
bfs
 */

import java.util.*;

public class Solution2 {

  static int minRoute = Integer.MAX_VALUE;
  static int[] dx = {0, 0, 1, -1};
  static int[] dy = {1, -1, 0, 0};
  static int n, m;
  static int[][] g;

  public int solution(int[][] maps) {
    g = maps;
    n = maps.length;
    m = maps[0].length;

    BFS(0, 0);

    return minRoute == Integer.MAX_VALUE ? -1 : minRoute;

  }

  public void BFS(int x, int y) {
    Queue<int[]> queue = new LinkedList<>();

    // 방문한 곳은 -1로 처리
    g[x][y] = -1;
    queue.add(new int[]{x, y, 1});

    while (!queue.isEmpty()) {
      int[] cur = queue.poll();

      if (cur[0] == n - 1 && cur[1] == m - 1) {
        minRoute = Math.min(minRoute, cur[2]);
        return;
      }

      for (int i = 0; i < 4; i++) {
        int curX = cur[0] + dx[i];
        int curY = cur[1] + dy[i];
        int curCnt = cur[2] + 1;

        if (curX >= 0 && curX < n && curY >= 0 && curY < m && g[curX][curY] == 1) {
          queue.add(new int[]{curX, curY, curCnt});
          g[curX][curY] = -1;
        }
      }
    }
  }
}