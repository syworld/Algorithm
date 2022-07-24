package basic.array;

import java.util.Scanner;

/*
에라토스테네스 체
이중 for 문 돌리면 시간 초과
 */
public class 소수_5 {

  public int countPrime(int n) {
    int cnt = 0;
    int[] ch = new int[n + 1];
    for (int i = 2; i <= n; i++) {
      if (ch[i] == 0) {
        cnt++;
        for (int j = i; j <= n; j = j + i) {
          ch[j] = 1;
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    소수_5 T = new 소수_5();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    T.countPrime(n);

  }

}
