import java.util.Scanner;
/*
백준 10950
A+B - 3
문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
public class PrintSum3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int caseCnt = scan.nextInt();

        for(int i = 1; i <= caseCnt; i++){
            int fst = scan.nextInt();
            int scnd = scan.nextInt();
            System.out.println(fst + scnd);
        }
    }
}
