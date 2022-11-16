package programmers;

public class OddEven {
    public static String solution(int num) {
        String answer = "Even";
        int remainder = num % 2;
        remainder *= remainder;
        if(remainder == 1) {
            answer = "Odd";
        }
        return answer;
    }
}
