import java.util.*;

/*
기능 개발 - Queue
 */
public class Solution1 {

  public int[] solution(int[] progresses, int[] speeds) {
    ArrayList<Integer> answer = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();

    // 배포까지 남은 일수로 queue 세팅
    for (int i = 0; i < progresses.length; i++) {
      int leftDay = 100 - progresses[i];
      if ((leftDay % speeds[i]) == 0) {
        queue.offer(leftDay / speeds[i]);
      } else {
        queue.offer(leftDay / speeds[i] + 1);
      }
    }

    // queue 동작 확인
    int current = queue.poll();
    int cnt = 1;

    while (!queue.isEmpty()) {
      int val = queue.poll();

      if (val <= current) {
        cnt++;
      } else {
        answer.add(cnt);
        cnt = 1;
        current = val;
      }
    }

    // 나머지 더해주기
    answer.add(cnt);

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}