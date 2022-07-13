package programmers.heap;
/*
이준우선순위큐 - heap
 */

import java.util.*;

public class Solution3 {

  public int[] solution(String[] operations) {
    int[] answer = new int[2];
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

    for (String op : operations) {
      String command = op.split(" ")[0];
      int num = Integer.parseInt(op.split(" ")[1]);
      if (command.equals("I")) {
        minHeap.add(num);
        maxHeap.add(num);
      } else {
        if (minHeap.isEmpty()) {
          continue;
        }

        if (num == 1) {
          int val = maxHeap.poll();
          minHeap.remove(val);
        } else {
          int val = minHeap.poll();
          maxHeap.remove(val);
        }
      }
    }

    if (!minHeap.isEmpty()) {
      answer[0] = maxHeap.poll();
      answer[1] = minHeap.poll();
    }

    return answer;
  }

}
