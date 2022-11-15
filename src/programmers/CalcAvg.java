package programmers;

public class CalcAvg {
    public double solution(int[] arr) {
        double answer = 0;
        int arrLength = arr.length;
        for(int number : arr) {
            answer += number;
        }
        answer /= arrLength;

        return answer;
    }
}
