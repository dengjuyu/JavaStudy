class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int nLen = numbers.length;
        for(int n : numbers){
            answer += n;
        }
        answer /= nLen;
        return answer;
    }
}