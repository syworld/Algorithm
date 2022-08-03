package basic.stackQueue;

import java.util.*;

public class 교육과정설계_7 {

  public String solution(String need, String plan) {
    String answer = "YES";
    Queue<Character> Q = new LinkedList<>();
    // 필수과목 queue에 넣기
    for (char x : need.toCharArray()) {
      Q.offer(x);
    }

    for (char x : plan.toCharArray()) {
      if (Q.contains(x)) {
        if (x != Q.poll()) {
          return "NO";
        }
      }
    }
    if (!Q.isEmpty()) {
      return "NO";
    }
    return answer;
  }

  public static void main(String[] args) {
    교육과정설계_7 T = new 교육과정설계_7();
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    System.out.println(T.solution(a, b));
  }

}
