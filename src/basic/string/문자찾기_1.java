package basic.string;

/**
 * 문자 찾기 Computercooler c result = 2
 */

import java.util.*;

public class 문자찾기_1 {

  public static void main(String[] args) {
    int answer = 0;
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    char c = sc.next().charAt(0);

    str = str.toUpperCase();
    c = Character.toUpperCase(c);

//        for(int i=0; i< str.length(); i++){
//            if(str.charAt(i)==c) {answer++;}
//        }

    for (char x : str.toCharArray()) {
      if (x == c) {
        answer++;
      }
    }
    System.out.println(answer);

  }
}