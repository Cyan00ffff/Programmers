class Solution {
    public int[] solution(int brown, int yellow) {
        //brown+yellow 의 값을 인수분해 한다음에 그 두 수에서 2씩 뺀 값의 곱이 yellow 와 같은지 확인       
        
        if(yellow==1){
            int[] temp={3,3};
            return temp;
        }
        
        int sum=brown+yellow;
        int[] temp ={0,0};
        for(int i=3; i<sum; i++){
            if(sum%i==0){
                int a=sum/i;
                int b=i;
                
                if((a-2)*(b-2)==yellow)
                    if(a>b){
                        temp[0]=a;
                        temp[1]=b;
                    }
                    else{
                        temp[0]=b;
                        temp[1]=a;
                    }
                        
            }
        }
        return temp;
    }
}