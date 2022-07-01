package basic.string;

/**
 * 문장 속 가장 긴 단어
 * it is time to study
 * sTUdy
 */

import java.util.Scanner;

public class 문장_속_단어_3 {

    public String solution(String str) {
        String answer = "";

        int maxWordLen = Integer.MIN_VALUE;
        int pos;
        while ((pos = str.indexOf(" ")) != -1) {
            // 띄어쓰기 발견할 때까지 루프
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > maxWordLen) {
                maxWordLen = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        // 마지막 단어 체크
        if(str.length()>maxWordLen){
            answer = str;
        }


//        String[] words = str.split(" ");
//        for(String word : words){
//            int wordLen = word.length();
//            if(wordLen>maxWordLen){
//                maxWordLen = wordLen;
//                answer = word;
//            }
//        }

        return answer;
    }


    public static void main(String[] args) {
        문장_속_단어_3 wordInSentence = new 문장_속_단어_3();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(wordInSentence.solution(str));
    }
}