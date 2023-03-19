class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ans[] = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            ans[i] = my_string.charAt(i);
        }
        //ans = my_string.charAt();
        for(char a : ans){
            if(Character.isUpperCase(a)){
                a = Character.toLowerCase(a);
            }else if(Character.isLowerCase(a)){
                a = Character.toUpperCase(a);
            }
            answer += String.valueOf(a);
        }
        return answer;
    }
}