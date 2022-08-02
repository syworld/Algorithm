package basic.stackQueue;

import java.util.*;

/*
Queue FIFO
Q.offer(x)
Q.poll()
Q.peek()
Q.size()
Q.contains(x)

입력
8 3

결과
7
 */
public class 공주구하기_6 {

  public int solution(int n, int k) {
    int answer = 0;
    Queue<Integer> Q = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      Q.offer(i);
    }
    while (!Q.isEmpty()) {
      for (int i = 1; i < k; i++) { // k-1 번
        Q.offer(Q.poll());
      }
      Q.poll(); // k 번째 제거

      if (Q.size() == 1) {
        answer = Q.poll();
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    공주구하기_6 T = new 공주구하기_6();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    System.out.println(T.solution(n, k));
  }

}
