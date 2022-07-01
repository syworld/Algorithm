package basic.string;

/** 중복 문자 제거
 * appletree
 * a 0 0
 * p 1 1
 * p 2 1
 * l 3 3
 * e 4 4
 * t 5 5
 * r 6 6
 * e 7 4
 * e 8 4
 * apletr
 */
import java.util.*;

public class 중복문자제거_6 {

    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++){
            // str.indexOf(c)는 가장 처음 인덱스 반환
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            // 현재 인덱스랑 가장 처음 인덱스랑 같은 경우만 누적
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        중복문자제거_6 duplicateWord = new 중복문자제거_6();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(duplicateWord.solution(str));
    }
}