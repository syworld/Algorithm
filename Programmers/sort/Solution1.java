import java.util.*;
/*
K번째수 - 정렬
 */
public class Solution1 {
  public int[] solution(int[] array, int[][] commands) {
    ArrayList<Integer> answer = new ArrayList<>();

    for(int[] command: commands){
      int firstIdx = command[0] -1;
      int lastIdx = command[1] -1;

      int[] newArray = Arrays.copyOfRange(array, firstIdx, lastIdx +1);

      Arrays.sort(newArray);
      answer.add(newArray[command[2] -1]);
    }

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}