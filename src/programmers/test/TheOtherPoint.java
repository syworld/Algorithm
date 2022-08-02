package programmers.test;
/*
나머지 한 점
XOR 연산 활용 - 세 값 중 다른 하나 찾기
 */
public class TheOtherPoint {
    public int[] solution(int[][] v) {
      int[] answer = new int[2];

      answer[0] = v[0][0] ^ v[1][0] ^ v[2][0];
      answer[1] = v[0][1] ^ v[1][1] ^ v[2][1];

      return answer;
    }
}
