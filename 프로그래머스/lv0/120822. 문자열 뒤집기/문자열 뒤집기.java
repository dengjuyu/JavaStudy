class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] str = my_string.toCharArray();
        for(int i = 0; i < my_string.length(); i++){
            answer += str[my_string.length()-i-1];
        }
        return answer;
    }
}