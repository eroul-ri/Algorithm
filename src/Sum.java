import java.util.Arrays;
import java.util.Scanner;

/*
백준 10171
곱셈
문제 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int one = scan.nextInt();
//        int two = scan.nextInt();
        int one = 472;
        int two = 385;
        //
        int [] numberO = new int[3];
        int [] numberT = new int[3];
        //
        numberO[2] = (one / 100); // 백의자리
        numberO[0] =  (one % 10);
        numberO[1] = ((one - (one / 100) * 100)) / 10; // 십의자리
        //
        numberT[2] = (two / 100);
        numberT[0] =  two % 10;
        numberT[1] = ((two - ((two / 100) * 100)) / 10);
        System.out.println(">> 첫번째" + Arrays.toString(numberO));
        System.out.println(">> 두번째" +Arrays.toString(numberT));

        //
        String [] result = new String[3];
        for(int i = 0; i <= numberO.length-1; i++) {
            for(int j = 0; j <= numberO.length-1; j++){
//                System.out.println(numberT[i] + "*" + numberO[j] + "???????????" + (numberO[j] * numberT[i]) / 10);
//                if(j < 2){
                    if((numberT[j] * numberO[i]) >= 10) { // 1의 자리수가 10보다 큰 경우
                        result[i] = (numberT[j] * numberO[i]) + "";
                    }else {
                        result[i] += (numberT[j] * numberO[i]) + "";
                    }
                    System.out.println(Arrays.toString(result));
//                }else { // 백의자리
//
//                }

//                if((numberO[i] * numberT[j]) >= 10) { // 1의 자리수가 10보다 큰 경우
//                    result[j] = (numberO[i] * numberT[j]) / 10;
//                }
//                result[0] = (numberO[i] * numberT[j]) % 10;
            }


////            System.out.println(mid);
////            System.out.println(mid +"/" + lst);
//            if(midO * midT >= 10){
//                fst = (midO * midT) / 10;
//            }
//            mid = (midO * midT) % 10;
//            fst += fstO * fstT;
        }
    }
}
