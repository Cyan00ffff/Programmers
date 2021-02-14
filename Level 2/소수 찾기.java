import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        boolean con=false;
        
        for(int i=0; i<Math.pow(10, numbers.length()); i++){
            int temp=i;
            con=true;
            String num=numbers;
            while(temp>0){
                int index=num.indexOf(Integer.toString(temp%10));
                if(index!=-1){
                    temp/=10;
                    num=num.substring(0,index)+num.substring(index+1);
                }else{
                    con=false;
                    break;
                }
            }
            if(con){
                if(isPrime(i)){
                    answer++;
                }
            }
        }
        
        
        
        return answer;
    }
    public boolean isPrime(int n){
        if(n==0||n==1)
            return false;
        for(int i=2 ;i<n; i++){//n/2+1
            if(n%i==0)
                return false;
        }
        return true;
    }
}