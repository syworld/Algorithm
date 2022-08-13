package basic.dp;

import java.util.Scanner;

/*
돌다리 n개를 건더는 방법의 수는 dy[n+1] 출력해야함 주의
 */
public class 돌다리건너기_2 {
    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n + 1; i++) dy[i] = dy[i - 2] + dy[i - 1];
        return dy[n + 1];
    }

    public static void main(String[] args) {
        돌다리건너기_2 T = new 돌다리건너기_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 2];
        System.out.print(T.solution(n));
    }
}
