package basic.hash;

import java.util.*;

/*
HashMap
map.containsKey('F')
map.size()
map.remove('C')
map.getOrDefault(x, 0)
map.keySet()
 */
public class 학급_회장_1 {

  public char solution(int n, String s) {
    char answer = ' ';
    HashMap<Character, Integer> map = new HashMap<>();
    for (char x : s.toCharArray()) {
      map.put(x, map.getOrDefault(x, 0) + 1);
    }

    int max = Integer.MIN_VALUE;
    for (char key : map.keySet()) {
      if (map.get(key) > max) {
        max = map.get(key);
        answer = key;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    학급_회장_1 T = new 학급_회장_1();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    System.out.println(T.solution(n, str));
  }

}
