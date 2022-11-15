package programmers;

public class OddEven {
    public String solution(int num) {
        String answer = "Even";
        int remainder = num % 2;
        if(remainder == 1 || remainder == -1) {
            answer = "Odd";
        }
        return answer;
    }
}
