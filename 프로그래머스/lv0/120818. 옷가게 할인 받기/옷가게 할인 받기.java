class Solution {
    public int solution(int price) {
        int answer = 0;
        // ~10만
        // 10만~30만
        // 30만~50만
        // 50만~
        answer = (price < 100000) ? price : (price < 300000) ? (int)(price * 0.95) : (price < 500000) ? (int)(price * 0.9) : (int)(price * 0.8);
        
        return answer;
    }
}