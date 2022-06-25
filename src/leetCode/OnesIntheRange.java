package leetCode;

import java.util.Scanner;

/**
 * Ones in the range - Facebook
 * <p>
 * 커스텀 클래스 내에 1과 0으로 이루어진 배열 arr이 있을 때, 주어진 인덱스 s와 e 사이에(inclusive) 몇 개의 1이 존재하는지를 리턴하는 함수를 작성하세요.
 * <p>
 * 예제 1: 입력: arr = [0, 0, 1, 0, 1], s = 2, e = 4 출력: 2
 * <p>
 * 예제 2: 입력: arr = [0, 1, 1, 0, 0, 1, 1, 1], s = 2, e = 6 출력: 3
 * <p>
 * 예제 3: 입력: arr = [0, 1, 1, 0, 0, 1, 1, 1], s = 1, e = 7 출력: 5
 */
public class OnesIntheRange {

  // arr의 사이즈
  // numOfOnes의 호출 여러번
  //  [0, 1, 1, 0, 0, 1, 1, 1]
  //  [0, 1, 2, 2, 2, 3, 4, 5]
  static final int[] arr = new int[]{0, 0, 1, 0, 1}; // ex 1
  static int[] ones;

  // O(N) 연산을 다른 메소드에서 처리한다.
  public OnesIntheRange() {
    // prefix sum
    ones[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      ones[i] = ones[i - 1] + arr[i];
    }
  }

  // O(1)
  public int numOfOnes(int s, int e) {
    // implementation
    return s == 0 ? ones[e] : ones[e] - ones[s - 1];
  }

}