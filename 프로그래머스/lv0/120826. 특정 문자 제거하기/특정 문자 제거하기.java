import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] arr = my_string.split("");
        List<String> arrList = Arrays.asList(arr);
        List<String> ansList = new ArrayList<>();
        
        arrList.stream().forEach(a->{
            if(!a.equals(letter)){
                ansList.add(a);
                //answer += a;
            }
        });
        for(String a : ansList){
            answer += a;
        }
        return answer;
    }
}