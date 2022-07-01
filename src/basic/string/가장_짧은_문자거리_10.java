package basic.string;

/**
 * 문자열에서 특정 문자와의 거리 구하기
 * teachermode e
 * 1 0 1 2 1 0 1 2 2 1 0
 */

import java.util.*;

public class 가장_짧은_문자거리_10 {

  public int[] solution(String str, char c) {
    int[] answer = new int[str.length()];
    // 가장 왼쪽 문자 c 위치 기준으로 구하기
    // 100001 0 1 2 3 0 1 2 3 4 0
    // 가장 오른쪽 문자 c 위치 기준으로 구하기
    // 1      0 1 2 1 0 1 2 2 1 0
    int point = 100000;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == c) point = 0;
      else point++;
      answer[i] = point;
    }

    point = 100000;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == c) point = 0;
      else {
        point++;
        answer[i] = Math.min(answer[i], point); // 왼쪽 문자로 계산한 결과와 비교
      }
    }

    return answer;
  }


  public static void main(String[] args) {
    가장_짧은_문자거리_10 distance = new 가장_짧은_문자거리_10();
    Scanner scanner = new Scanner(System.in);

    String str = scanner.next();
    char c = scanner.next().charAt(0);
    // 배열 출력
    for (int x : distance.solution(str, c)) {
      System.out.print(x + " ");
    }
  }
}