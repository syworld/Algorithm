/** 문자열에서 특정 문자와의 거리 구하기
 * teachermode e
 * 1 0 1 2 1 0 1 2 2 1 0
 */
import java.util.*;

public class Distance {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        // 왼쪽 문자 기준으로 구하기
        // 100001 0 1 2 3 0 1 2 3 4 0
        // 오른쪽 문자 기준으로 구하기
        // 1      0 1 2 1 0 1 2 2 1 0
        int point = 100000;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==c){
                point =0;
            }else{
                point++;
            }
            answer[i] = point;


        }

        point = 100000;
        for(int i=str.length() -1; i>=0;i--){
            if(str.charAt(i)==c){
                point =0;
            }else{
                point++;
                answer[i] = Math.min(answer[i], point);
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Distance distance = new Distance();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);
        // 배열 출력
        for(int x: distance.solution(str,c)){
            System.out.print(x+" ");
        }
    }
}