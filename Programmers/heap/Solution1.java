import java.util.*;

/*
문제: 더 맵게

PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); 낮은 순 정렬
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); 높은 순 정렬

add() 큐에 요소를 추가 O(log n)
poll() 우선순위가 가장 높은 데이터 제거 O (log n)
peek() 우선순위가 가장 높은 데이터 확인 O (1)

*/

public class Solution1 {
  public int solution(int[] scoville, int K) {
    int answer = 0;

    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    for(int scov: scoville){
      minHeap.add(scov);
    }

    while(minHeap.peek() < K){
      // null 처리
      if (minHeap.size() == 1) {
        return -1;
      }

      int firstVal = minHeap.poll();
      int secondVal = minHeap.poll();
      minHeap.add(firstVal + 2 * secondVal);
      answer++;
    }

    return answer;
  }
}