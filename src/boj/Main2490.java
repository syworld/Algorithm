package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2490 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for(int i=0; i< 3; i++){
      int tot = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      while(st.hasMoreTokens()){
        tot += Integer.parseInt(st.nextToken());
      }
      System.out.println(find(tot));
    }
  }

  public static String find(int sum){
    if(sum ==3) return "A";
    else if(sum == 2) return "B";
    else if(sum ==1) return "C";
    else if(sum == 0) return "D";
    else return "E";
  }

}
