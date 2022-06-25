package leetCode;

// Binary Search template method
public class BinarySearch {

  public int solution() {
    int l = 0; // min value
    int r = 1000; // max value

    while (l < r) {
      int m = l + (r - l) / 2;
      if (condition(m)) {
        r = m;
      } else {
        l = m + 1;
      }
    }
    // condition을 만족하는 min index 리턴
    return l;
  }


  private boolean condition(int m) {
    return true;
  }


}