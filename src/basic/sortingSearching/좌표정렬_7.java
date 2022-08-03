package basic.sortingSearching;

import java.util.*;

/*
좌표 정렬
5
2 7
1 3
1 2
2 5
3 6

결과
1 2
1 3
2 5
2 7
3 6
 */
class Point implements Comparable<Point> {

  public int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // this -> obj 순
  // 내림차순: this > obj : obj - this
  // 오름차순: this < obj : this - obj

  // 오름차순 정렬
  @Override
  public int compareTo(Point obj) {
    if (this.x == obj.x) {
      return this.y - obj.y;
    } else {
      return this.x - obj.x;
    }
  }

  // 내림차순 정렬
  public int compareTo2(Point obj) {
    if (this.x == obj.x) {
      return obj.y - this.y;
    } else {
      return obj.x - this.x;
    }
  }
}

public class 좌표정렬_7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Point> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      arr.add(new Point(x, y));
    }
    Collections.sort(arr);
    for (Point o : arr) {
      System.out.println(o.x + " " + o.y);
    }
  }

}
