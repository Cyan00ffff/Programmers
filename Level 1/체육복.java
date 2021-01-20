class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] temp = new int[n+2];
        for(int i=0; i<n+2; i++){
            temp[i]=1;
        }
        for(int i=0; i<lost.length; i++){
            temp[lost[i]]=0;
        }
        for(int i=0; i<reserve.length; i++){
            temp[reserve[i]]+=1;
        }
        temp[0]=-1;
        temp[n+1]=-1;
        for(int i=1; i<n+1; i++){
            if(temp[i]==0){
                if(temp[i-1]==2){
                    temp[i-1]-=1;
                    temp[i]+=1;
                }
                if(temp[i+1]==2){
                    temp[i+1]-=1;
                    temp[i]+=1;
                }
            }
        }
        for(int i=1; i<n+2; i++){
            if(temp[i]>=1)
                answer++;
        }
        return answer;
    }
}