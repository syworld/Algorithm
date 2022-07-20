package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
도로와 신호등
2 10
3 5 5
5 2 2

12
 */
public class Main2980 {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());
    int before = 0;
    int time = 0;

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int D = Integer.parseInt(st.nextToken());
      int R = Integer.parseInt(st.nextToken());
      int G = Integer.parseInt(st.nextToken());

      time += D - before;
      before = D;

      if( time % (R + G) <= R ){
        time += R - time % (R + G);
      }


    }


    System.out.println(time + L - before);

  }

}
