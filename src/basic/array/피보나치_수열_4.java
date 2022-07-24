package basic.array;

import java.util.Scanner;

public class 피보나치_수열_4 {

  public void solution1(int n){ // 배열 사용하지 않은 경우
    int a = 1, b=1, c;
    System.out.println(a + " " + b + " ");
    for(int i=2; i<n; i++){
      c = a+b;
      System.out.print(c+" ");
      a = b;
      b = c;

    }
  }

  public int[] solution2(int n){
    int[] arr = new int[n];
    arr[0] = 1;
    arr[1] = 1;
    for (int i = 2; i < n; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }
    return arr;
  }

  public static void main(String[] args) {
    피보나치_수열_4 T = new 피보나치_수열_4();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    T.solution1(n);

  }

}
