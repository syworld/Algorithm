import java.util.*;

/*
완주하지 못한 선수 - Hash
 */
public class Solution1 {

  public String solution(String[] participant, String[] completion) {

    String answer = "";
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (String person : participant) {
      hashMap.put(person, hashMap.getOrDefault(person, 0) + 1);
    }
    for (String completed : completion) {
      hashMap.put(completed, hashMap.get(completed) - 1);
    }

    for (String key : hashMap.keySet()) {
      if (hashMap.get(key) != 0) {
        answer = key;
        break;
      }
    }
    return answer;
  }
}