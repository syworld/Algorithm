import java.util.*;

/*
전화번호 목록 - 문자열 비교
 */
public class Solution2 {

  public boolean solution(String[] phone_book) {
    boolean answer = true;

    // 길이 순서로 정렬
    Arrays.sort(phone_book);

    for (int i = 0; i < phone_book.length - 1; i++) {
      if (phone_book[i + 1].startsWith(phone_book[i])) {
        answer = false;
        break;
      }
    }

    return answer;
  }
}