import java.util.Scanner;
/*
백준 1157
단어 공부
단계 : 문자열단계
문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
입력 : 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
출력 : 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
public class StyWord {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String word  = scan.next().toUpperCase();
        char result = cntAlp(word);
        System.out.println(result);
    }

    public static char cntAlp(String word){
        // 총 알파벳 26;
        int A = 65;
        int [] cnt = new int[26];
        int max = 0;
        char result = '?';
        for(int i = 0; i < word.length(); i++){
            int tmp = word.charAt(i);
            cnt[(tmp - A)]++;
            if(max < cnt[tmp - A]){
                max = cnt[tmp - A];
                result =  word.charAt(i);
            }else if(max == cnt[tmp-A]){
                result = '?';
            }
        }
        return result;
    }
}
