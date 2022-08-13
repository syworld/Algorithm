package basic.dp;

import java.util.Scanner;

public class 최대부분증가수열_3 {
    static int[] dy; //arr[i]번째를 마지막 항으로 하는 최대 증가수열 길이
    // arr : 5 3 7 8 6 2 9 4
    // dy  : 1 1 2 3 2 1 4 2
    // dy[2] : 37 or 57
    public int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) { // 자기 앞에서부터 자기보다 작고, 제일 큰 값 +1
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]); // dy 중에서 제일 큰 값이 답
        }
        return answer;
    }

    public static void main(String[] args) {
        최대부분증가수열_3 T = new 최대부분증가수열_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(arr));
    }
}
