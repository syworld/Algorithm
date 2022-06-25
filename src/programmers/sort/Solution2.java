package programmers.sort;

import java.util.*;
import java.util.stream.*;
/*
가장 큰 수 - 정렬
 */
public class Solution2 {
  public String solution(int[] numbers) {
    String answer = "";

    // string으로 변환해서 reverse sort
    String[] newNumbers = new String[numbers.length];
    for(int i=0; i<numbers.length; i++){
      newNumbers[i] = Integer.toString(numbers[i]);
    }

    // 30 3 인 경우 비교 필요하므로 override compare()
    Arrays.sort(newNumbers, (n1, n2)->{
      return (n2+n1).compareTo(n1+n2);});

    // for(String number: newNumbers){
    //     answer += number;
    // }

    // System.out.println(Arrays.toString(newNumbers));
    answer = newNumbers[0].equals("0") ? "0" : Arrays.stream(newNumbers).collect(Collectors.joining());

    return answer;
  }
}