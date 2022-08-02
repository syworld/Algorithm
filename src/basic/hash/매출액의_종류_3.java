package basic.hash;

import java.util.*;

/*
HashMap + sliding window
연속 k개의 매출액 종류 순서대로 출력
 */
public class 매출액의_종류_3 {

  public ArrayList<Integer> solution(int n, int k, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    // 0 ~ k-1 까지만 세팅
    for (int i = 0; i < k - 1; i++) {
      hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
    }

    // rt가 돌면서 lt 증가
    int lt = 0;
    for (int rt = k - 1; rt < n; rt++) {
      // rt 하나 넣고
      hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);

      // key 개수만큼 넣음
      answer.add(hashMap.size());

      // lt를 빼고, hashMap 에서도 -1
      hashMap.put(arr[lt], hashMap.get(arr[lt]) - 1);
      // 0이어도 hashmap key로 카운트되니깐 제거
      if (hashMap.get(arr[lt]) == 0) {
        hashMap.remove(arr[lt]);
      }
      // lt 증가
      lt++;
    }
    return answer;
  }

  public static void main(String[] args) {
    매출액의_종류_3 T = new 매출액의_종류_3();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    for (int x : T.solution(n, k, arr)) {
      System.out.print(x + " ");
    }
  }

}
