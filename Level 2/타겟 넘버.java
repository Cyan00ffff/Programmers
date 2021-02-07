import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int n=numbers.length; 
        int size = (int)Math.pow(2,n)-1;
        String[] temp = new String[size+1];
        for(int i=0; i<=size; i++){
            temp[i]=makeTwo(i,n);
        }
        
        for(int i=0; i<=size; i++){
            int a=0;
            for(int j=0; j<n; j++){
                if(temp[i].charAt(j)=='0'){
                    a+=numbers[j];
                }else{
                    a-=numbers[j];
                }
            }
            if(a==target)
                answer++;
        }
        
        return answer;
    }
    
    public String makeTwo(int n, int size){
        String temp="";
        
        if(n==0)
            temp="0";
        else{
            while(n>0){
                if(n%2==1)
                    temp+="1";
                else
                    temp+="0";
                n/=2;
            }
        }
        String ret = temp;
        while(ret.length()<size)
            ret+="0";
        
        return ret;
    }
}