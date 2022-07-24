package basic.array;

import java.util.Scanner;

public class 뒤집은_소수_6 {

  public int reverse(int num) {
    int res = 0;
    while (num > 0) {
      res = res * 10 + num % 10;
      num /= 10;
    }
    return res;
  }

  public boolean isPrime(int num) {
    if (num == 1) {
      return false;
    }

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    뒤집은_소수_6 T = new 뒤집은_소수_6();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      int reverseNum = T.reverse(num);
      if (T.isPrime(reverseNum)) {
        System.out.print(reverseNum + " ");
      }
    }

  }

}
