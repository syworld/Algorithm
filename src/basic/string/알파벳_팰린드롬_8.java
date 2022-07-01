package basic.string;

/** 알파벳만 검사하는 회문 문자열 (대소문자 구별X)
 * gooG , apple ;;k @ k elppa goo* &g
 * YES
 */
import java.util.*;

public class 알파벳_팰린드롬_8 {

    public String solution(String str) {
        String answer = "NO";
        // 알파벳이 아닌 값은 ""로 변환
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(tmp.equals(str)) answer = "YES";

        return answer;
    }



    public static void main(String[] args) {
        알파벳_팰린드롬_8 palindrom = new 알파벳_팰린드롬_8();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(palindrom.solution(str));
    }
}