class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double ans = (double)(num1)/(double)num2*1000.0;
        answer = (int)ans;
        return answer;
    }
}