package programmers.stackQueue;

/*
주식가격 - stack
 */

import java.util.*;

public class Solution4 {

  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    Deque<Integer> stack = new LinkedList<>();

    for (int i = 0; i < prices.length; i++) {
      //index를 stack에 넣기
      while (!stack.isEmpty() && prices[i] < prices[stack.peekLast()]) {
        int beforeIdx = stack.pollLast();
        answer[beforeIdx] = i - beforeIdx;
      }
      stack.add(i);
    }

    // 끝까지 가격이 떨어지지 않은 원소
    while (!stack.isEmpty()) {
      int idx = stack.pollLast();
      answer[idx] = prices.length - idx - 1;
    }

    return answer;
  }

//  public int[] solution(int[] prices) {
//    int size = prices.length;
//    int[] answer = new int[size];
//    for (int i = 0; i < size; i++) {
//      for (int j = i + 1; j < size; j++) {
//        answer[i] += 1;
//        if (prices[i] > prices[j]) {
//          break;
//        }
//      }
//    }
//    return answer;
//  }
}
