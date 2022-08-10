package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
입력
7 (1 ≤ N ≤ 100)
0 0 0 1 0 0 0
0 0 0 0 0 0 1
0 0 0 0 0 0 0
0 0 0 0 1 1 0
1 0 0 0 0 0 0
0 0 0 0 0 0 1
0 0 1 0 0 0 0

결과
1 0 1 1 1 1 1
0 0 1 0 0 0 1
0 0 0 0 0 0 0
1 0 1 1 1 1 1
1 0 1 1 1 1 1
0 0 1 0 0 0 1
0 0 1 0 0 0 0
 */
public class Main11403 {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];
    StringTokenizer st;

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int j = 0;
      while (st.hasMoreTokens()) {
        arr[i][j++] = Integer.parseInt(st.nextToken());
      }
    }

    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (arr[i][k] == 1 && arr[k][j] == 1) {
            arr[i][j] = 1;
          }
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        sb.append(arr[i][j] + " ");
      }
      sb.append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();

//    for(int i=0; i<n; i++) {
//      for(int j=0; j<n; j++) {
//        System.out.print(arr[i][j]+" ");
//      }
//      System.out.println();
//    }

  }

}
