package basic.hash;

import java.util.HashMap;
import java.util.Scanner;

/*
HashMap + Sliding window O(N)

입력
bacaAacba
abc

결과
3
{bac}, {acb}, {cba}
 */
public class 모든_아나그램_찾기_4 {

  public int solution(String a, String b) {
    // 2개 hashmap으로 구성
    // bMap = [a b c]
    // aMap = [b a] + 1씩하면서 sliding window로 bMap과 equal인지 비교

    int answer = 0;
    HashMap<Character, Integer> am = new HashMap<>();
    HashMap<Character, Integer> bm = new HashMap<>();

    // bMap 초기화
    for (char x : b.toCharArray()) {
      bm.put(x, bm.getOrDefault(x, 0) + 1);
    }

    // aMap 초기화. bMap 보다 -1 작게
    int L = b.length() - 1;
    for (int i = 0; i < L; i++) {
      am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
    }

    // sliding window로 aMap, bMap 비교
    int lt = 0;
    for (int rt = L; rt < a.length(); rt++) {
      // rt 넣어주고
      am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
      if (am.equals(bm)) {
        answer++;
      }

      // lt 값 제거
      am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
      if (am.get(a.charAt(lt)) == 0) { // value가 0이면 key 제거
        am.remove(a.charAt(lt));
      }
      // lt 증가
      lt++;
    }
    return answer;
  }

  public static void main(String[] args) {
    모든_아나그램_찾기_4 T = new 모든_아나그램_찾기_4();
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    System.out.println(T.solution(s1, s2));
  }

}
