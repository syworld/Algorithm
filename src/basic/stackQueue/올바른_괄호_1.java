package basic.stackQueue;

import java.util.*;
/*
(())() YES
(()())) NO
 */
public class 올바른_괄호_1 {

  public String solution(String str) {
    String answer = "YES";
    Stack<Character> stack = new Stack<>();
    for (char x : str.toCharArray()) {
      if (x == '(') {
        stack.push(x);
      } else {
        if (stack.isEmpty()) {
          return "NO";
        }
        stack.pop();
      }
    }
    if (!stack.isEmpty()) {
      return "NO";
    }
    return answer;
  }

  public static void main(String[] args) {
    올바른_괄호_1 T = new 올바른_괄호_1();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.println(T.solution(str));
  }

}
