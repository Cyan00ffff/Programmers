class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int temp=x;
        int divisor=0;
        while(temp>0){
            divisor+=temp%10;
            temp=temp/10;
        }
        if(x%divisor==0)
            answer=true;
        return answer;
    }
}