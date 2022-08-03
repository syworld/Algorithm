package basic.sortingSearching;

import java.util.*;

/*
입력
9
120 125 152 130 135 135 143 127 160

결과
3 8
 */
public class 장난꾸러기_6 {

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    int[] tmp = arr.clone(); // deep copy
    Arrays.sort(tmp);
    for (int i = 0; i < n; i++) {
      if (arr[i] != tmp[i]) {
        answer.add(i + 1);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    장난꾸러기_6 T = new 장난꾸러기_6();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }

}
