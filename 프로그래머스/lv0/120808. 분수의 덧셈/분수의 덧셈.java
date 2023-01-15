class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        
        int[] answer = new int[2];
        if(denom1 == denom2){
            answer[0] = (numer1 + numer2) / getGcd(numer1+numer2, denom1);
            answer[1] = denom1 / getGcd(numer1+numer2, denom1);
        }else{
            int denom3 = (denom1*denom2)/getGcd(denom1, denom2);
            answer[0] = (numer1*(denom3/denom1) + numer2*(denom3/denom2)) / getGcd(numer1*(denom3/denom1) + numer2*(denom3/denom2), denom3);
            answer[1] = denom3 / getGcd(numer1*(denom3/denom1) + numer2*(denom3/denom2), denom3);
        }
        
        return answer;
    }
    
    public static int getGcd(int num1, int num2){
        
        if(num1 % num2 == 0){
            return num2;
        }
        return getGcd(num2, num1%num2);
    }
}