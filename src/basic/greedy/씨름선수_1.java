package basic.greedy;

import java.util.*;

class Body implements Comparable<Body> {

  public int h, w;

  Body(int h, int w) {
    this.h = h;
    this.w = w;
  }

  @Override
  public int compareTo(Body o) {// 키 기준 내림차순 정렬
    return o.h - this.h;
  }
}

public class 씨름선수_1 {

  public int solution(ArrayList<Body> arr, int n) {
    int cnt = 0;
    Collections.sort(arr);

    // O(N)
    int maxW = Integer.MIN_VALUE; // 최대 몸무게
    for (Body body : arr) {
      if (body.w > maxW) {
        maxW = body.w;
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    씨름선수_1 T = new 씨름선수_1();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Body> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int h = sc.nextInt();
      int w = sc.nextInt();
      arr.add(new Body(h, w));
    }
    System.out.println(T.solution(arr, n));
  }

}
