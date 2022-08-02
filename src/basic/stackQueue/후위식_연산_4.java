package basic.stackQueue;

import java.util.*;

/*
3*(5+2)-9

입력
352+*9-

결과
12
 */
public class 후위식_연산_4 {

  public int solution(String str) {
    int answer = 0;
    Stack<Integer> stack = new Stack<>();
    for (char x : str.toCharArray()) {
      if (Character.isDigit(x)) {
        stack.push(x - 48); // char -> int  '0'(=48) 빼주기, '1' = 49
      } else {
        int rt = stack.pop();
        int lt = stack.pop();
        if (x == '+') {
          stack.push(lt + rt);
        } else if (x == '-') {
          stack.push(lt - rt);
        } else if (x == '*') {
          stack.push(lt * rt);
        } else if (x == '/') {
          stack.push(lt / rt);
        }
      }
    }
    answer = stack.get(0);
    return answer;
  }

  public static void main(String[] args) {
    후위식_연산_4 T = new 후위식_연산_4();
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(T.solution(str));
  }

}
