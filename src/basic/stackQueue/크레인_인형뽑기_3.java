package basic.stackQueue;

import java.util.*;

/*
입력
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1

8
1 5 3 5 1 2 1 4

결과
4
 */
public class 크레인_인형뽑기_3 {

  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();
    for (int pos : moves) {
      // 고정된 열에서 행 하나씩 내려가면서 비교
      for (int i = 0; i < board.length; i++) {
        if (board[i][pos - 1] != 0) {
          int tmp = board[i][pos - 1];
          board[i][pos - 1] = 0; // 값 0으로 만들어줌
          if (!stack.isEmpty() && tmp == stack.peek()) { // 바구니에 있는 값이랑 같으면 2개 제거
            answer += 2;
            stack.pop();
          } else {
            stack.push(tmp);
          }
          break; // 1회만 동작 후, for 문 멈추기
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    크레인_인형뽑기_3 T = new 크레인_인형뽑기_3();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] board = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = sc.nextInt();
      }
    }
    int m = sc.nextInt();
    int[] moves = new int[m];
    for (int i = 0; i < m; i++) {
      moves[i] = sc.nextInt();
    }
    System.out.println(T.solution(board, moves));
  }

}
