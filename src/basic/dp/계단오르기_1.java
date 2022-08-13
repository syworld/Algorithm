package basic.dp;

import java.util.Scanner;

public class 계단오르기_1 {
    static int[] dy;

    public int solution(int n){
        //dy[i] = i번째 계단으로 가는 방법의 수
        dy[1]=1;
        dy[2]=2;
        for(int i=3; i<=n; i++) dy[i]=dy[i-2]+dy[i-1];
        return dy[n];
    }

    public static void main(String[] args){
        계단오르기_1 T = new 계단오르기_1();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        dy=new int[n+1];
        System.out.print(T.solution(n));
    }
}
