package basic.greedy;

import java.util.*;
/*
최대 사용할 수 있는 회의 수
 */

class Time implements Comparable<Time> {

  public int start, end;

  Time(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public int compareTo(Time o) {
    // 끝나는 시간 같으면 시작 시간으로 오름차순 정렬
    if (this.end == o.end) {
      return this.start - o.start;
    } else {
      return this.end - o.end;
    }
  }
}

public class 회의실배정_2 {

  public int solution(ArrayList<Time> arr) {
    int cnt = 0;
    Collections.sort(arr);
    int endTime = 0;
    for (Time ob : arr) {
      if (ob.start >= endTime) {
        cnt++;
        endTime = ob.end;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    회의실배정_2 T = new 회의실배정_2();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Time> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr.add(new Time(x, y));
    }
    System.out.println(T.solution(arr));
  }

}
