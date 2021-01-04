import java.util.Scanner;

/*
백준 1316
그룹단어 체커
문제 : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
입력 :  첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
둘째 줄부터 N개의 줄에 단어가 들어온다.
단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
출력 : 첫째 줄에 그룹 단어의 개수를 출력한다.
*/
public class GroupWord {
    // 아스키코드 소문자 a
    static final int A = 97;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int group = 0;
        int wordCase = Integer.parseInt(scan.nextLine());
        for(int i = 1; i <= wordCase; i++){
            String word = scan.nextLine();
            group = isGroupWord(word) ? ++group : group;
        }
        System.out.println(group);
    }

    public static boolean isGroupWord(String word){
        boolean isGroupWord = true;
        boolean [] alp = new boolean[26];
        for(int i = 0; i < word.length(); i++){
            char tmp = word.charAt(i);
            char before = i == 0 ? tmp : word.charAt(i-1);
            int index = tmp - A;
            if(alp[index] && tmp != before){ // 이미 존재
                isGroupWord = false;
                return isGroupWord;
            }else { // 처음인 경우
                alp[index] = true;
            }
        }
        return isGroupWord;
    }
}
