/** 단어에서 알파벳만 뒤집기
 * g1kpk#!#s#od
 * d1osk#!#p#kg
 */
import java.util.*;

public class SpecificReverse {

    public String solution(String str) {
        String answer;
        // String을 문자 배열로 변환
        char[] charArr = str.toCharArray();
        int lt =0, rt= str.length() -1;
        while(lt<rt){
            // 알파벳이 아니면 다음 인덱스로 넘어감
            if(!Character.isAlphabetic(charArr[lt])) lt++;
            else if(!Character.isAlphabetic(charArr[rt])) rt--;
            else{
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        //String으로 전환
        answer = String.valueOf(charArr);
        return answer;
    }


    public static void main(String[] args) {
        SpecificReverse reverse = new SpecificReverse();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(reverse.solution(str));
    }
}