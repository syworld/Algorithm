package basic.stackQueue;

import java.util.*;

/*
잘려진 조각의 총 개수
(((()(()()))(())()))(()())
24
 */
public class 쇠막대기_5 {

  public int solution(String str) {
    int cnt = 0;
    Stack<Character> stack = new Stack<>();
    // ( 이면 push
    // ) 이면 ( 이 바로 나오면 : 레이저고 ( pop, 막대 개수는 남은 ( 개수
    // ) 이면 ) 이면 막대기 끝이니깐 + 1

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '(') {
        stack.push('(');
      } else {
        stack.pop();
        if (str.charAt(i - 1) == '(') {
          cnt += stack.size(); // 막대기 개수
        } else {
          cnt++; // 막대기 끝
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    쇠막대기_5 T = new 쇠막대기_5();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
  }

}
