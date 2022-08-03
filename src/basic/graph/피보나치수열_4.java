package basic.graph;

/*
for 문 풀이가 재귀보다 성능이 더 좋음
 */
public class 피보나치수열_4 {

  static int[] fibo;

  public int DFS(int n) {
    if (fibo[n] > 0) {
      return fibo[n]; // memoization
    }

    if (n == 1 || n == 2) {
      return fibo[n] = 1;
    } else {
      return fibo[n] = DFS(n - 2) + DFS(n - 1); // 저장하고 값 리턴
    }
  }

  public static void main(String[] args) {
    피보나치수열_4 T = new 피보나치수열_4();
    int n = 5;
//    안 좋은 풀이 DFS 호출. 계속 스택 프레임 쌓임
//    for (int i = 1; i <= n; i++) {
//      System.out.print(T.DFS(i));
//    }

//    좋은 풀이
    fibo = new int[n + 1];
    T.DFS(n);
    for (int i = 1; i <= n; i++) {
      System.out.print(fibo[i] + " ");
    }

  }

}
