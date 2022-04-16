/** 단어 뒤집기
 * 2
 * good
 * hello
 * doog
 * olleh
 */
import java.util.*;

public class Reverse {

    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        // Solution #1: StringBuilder reverse() 사용
//        for(String x: str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        for(String x: str){
            // String을 문자 배열로 변환
            char[] charArr = x.toCharArray();
            int lt =0, rt= x.length() -1;
            while(lt<rt){
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }
            // String으로 다시 변환
            String tmp = String.valueOf(charArr);
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scanner.next();
        }
        for(String x: reverse.solution(str)){
            System.out.println(x);
        }
    }
}