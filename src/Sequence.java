import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
백준 1065
한수
문제 :어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고,
N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
입력 : 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
출력 : 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */
public class Sequence {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3]; // 100부터 1000까지의 자리수를 담음.
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1000) {
                break;
            } else if (i < 100) {
                count++;
            } else {// 100부터
                int a = i;
                int idx = 0;
                while (a > 0) {//
                    num[idx] = a % 10;
                    a /= 10;
                    idx++;
                }
                if ((num[0] - num[1]) == (num[1] - num[2])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
