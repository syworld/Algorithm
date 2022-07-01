package basic.string;

/** 숫자만 추출 (맨앞 0은 제외)
 * tetjkw0jtk2tjwkejtkw0kewjtk2wketj2e
 * 2022
 */
import java.util.*;

public class 숫자만_추출_9 {

    public int solution(String str) {
        int answer = 0;

        // Solution #1 : 아스키코드
        for(char x: str.toCharArray()){
            // '0' ~ '9' : 48 ~ 57
            if(x>=48 && x<=57) {
                answer = answer * 10 + (x-48);
            }
        }

        // Solution #2 : Character.isDigit()
        String answer2 = "";
        for(char x: str.toCharArray()){
            if(Character.isDigit(x)) answer2 += x;
        }
        answer = Integer.parseInt(answer2);


        return answer;
    }



    public static void main(String[] args) {
        숫자만_추출_9 number = new 숫자만_추출_9();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(number.solution(str));

    }
}