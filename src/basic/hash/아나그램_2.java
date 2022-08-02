package basic.hash;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램_2 {

  public String solution(String s1, String s2) {
    String answer = "YES";
    HashMap<Character, Integer> map = new HashMap<>();
    for (char x : s1.toCharArray()) {
      map.put(x, map.getOrDefault(x, 0) + 1);
    }
    for (char x : s2.toCharArray()) {
      if (!map.containsKey(x) || map.get(x) == 0) {
        return "NO";
      }
      map.put(x, map.get(x) - 1);
    }

    return answer;

  }
  
  public static void main(String[] args) {
    아나그램_2 T = new 아나그램_2();
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    System.out.println(T.solution(str1, str2));
  }

}
