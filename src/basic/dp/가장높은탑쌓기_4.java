package basic.dp;

import java.util.*;
/*
입력
5
25 3 4
4 4 6
9 2 3
16 2 5
1 5 2

결과
10

 */
class Brick implements Comparable<Brick> {

  public int s, h, w;

  Brick(int s, int h, int w) {
    this.s = s;
    this.h = h;
    this.w = w;
  }

  @Override
  public int compareTo(Brick o) {
    return o.s - this.s;
  } // 내림차순 정렬
}

public class 가장높은탑쌓기_4 {

  static int[] dy; // i번째 벽돌을 탑의 제일 위에 놓았을 때 탑의 최대 높이 = LIS

  /*
  Collections.sort(arr);
    0  1 2 3 4  arr
  s 25 16 9 4 1
  h 3 2 2 4 5
  w 4 5 3 6 2

  dy : 3 2 5 4 10
   */

  public int solution(ArrayList<Brick> arr) {
    int answer = 0;
    Collections.sort(arr); // s 기준 내림차순 정렬
    dy[0] = arr.get(0).h; // 1번째 벽돌의 높이. (넓이가 가장 큼)
    answer = dy[0]; // 1번째 벽돌이 가장 가벼운 케이스 가능하므로 초기화 필요


    for (int i = 1; i < arr.size(); i++) {
      int max_h = 0;
      for (int j = i - 1; j >= 0; j--) {
        if (arr.get(j).w > arr.get(i).w && dy[j] > max_h) { // i가 작아야함
          max_h = dy[j];
        }
      }
      dy[i] = max_h + arr.get(i).h;
      answer = Math.max(answer, dy[i]);
    }
    return answer;
  }

  public static void main(String[] args) {
    가장높은탑쌓기_4 T = new 가장높은탑쌓기_4();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ArrayList<Brick> arr = new ArrayList<>();
    dy = new int[n];

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      arr.add(new Brick(a, b, c));
    }
    System.out.print(T.solution(arr)); // 가장 높이 쌓을 수 있는 탑의 높이를 출력
  }

}
