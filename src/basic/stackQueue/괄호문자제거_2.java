package basic.stackQueue;

import java.util.Scanner;
import java.util.Stack;
/*
입력
(A(BC)D)EF(G(H)(IJ)K)LM(N)

결과
EFLM
 */
public class 괄호문자제거_2 {

  public String solution(String str) {
    // ) 만나면 ( 만날때까지 stack.pop()
    // 알파벳, ( 는 stack.push(x)
    String answer = "";
    Stack<Character> stack = new Stack<>();
    for (char x : str.toCharArray()) {
      if (x == ')') {
        while (stack.pop() != '('); // pop() 값 꺼내고 리턴
      } else {
        stack.push(x);
      }
    }
    for (int i = 0; i < stack.size(); i++) { // stack 도 배열
      answer += stack.get(i);
    }
    return answer;
  }

  public static void main(String[] args) {
    괄호문자제거_2 T = new 괄호문자제거_2();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
  }

}
