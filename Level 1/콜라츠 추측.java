class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = (long)num;
        while(number!=1){
            if(answer==500)
                break;
            
            if(number%2==0){
                number=number/2;
            }else{
                number=number*3+1;
            }
            answer++;
        }
        if(number!=1){
            answer=-1;
        }
            
        return answer;
    }
}