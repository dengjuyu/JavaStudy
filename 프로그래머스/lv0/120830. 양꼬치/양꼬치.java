class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000;
        if(n < 10){
            answer += k * 2000;
        }else {
            answer = n * 12000 + (k - n / 10) * 2000;    
        }
        return answer;
    }
}