package basic.hash;

import java.util.*;

/*
3개 합 중에서 k 번째 큰 수

TreeSet: 중복 제거 + 정렬

treeSet.size()
treeSet.remove(11)
treeSet.first()
treeSet.last()
 */
public class k번째_큰_수_5 {

  public int solution(int[] arr, int n, int k) {
    int answer = -1;
    TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int l = j + 1; l < n; l++) {
          treeSet.add(arr[i] + arr[j] + arr[l]);
        }
      }
    }

    int cnt = 0;
    for (int x : treeSet) {
      System.out.println(x);
      cnt++;
      if (cnt == k) {
        return x;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    k번째_큰_수_5 T = new k번째_큰_수_5();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(T.solution(arr, n, k));
  }

}
