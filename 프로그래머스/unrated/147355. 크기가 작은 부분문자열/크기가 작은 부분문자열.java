class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        //7
        //3
        String res = "";
        if(tLength >= pLength){
            for(int i=0; i+pLength<=tLength; i++){
                res = t.substring(i, i+pLength);
                //System.out.println(res);
                //System.out.println(res.compareTo(p));
                if(res.compareTo(p) <= 0) answer++;
                
            }    
        } else {
            answer = 0;
        }
        
        return answer;
    }
}