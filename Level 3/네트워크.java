import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] temp = new int[n];
        for(int i=0 ;i<n; i++){
            temp[i]=-(i+1);
        }
        int count=1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(computers[i][j]==1){
                    if(temp[i]<0&&temp[j]<0){
                        temp[i]=count;
                        temp[j]=count;
                        count++;
                    }else if(temp[i]>0&&temp[j]>0){
                        int t = temp[j];
                        for(int k=0; k<n; k++){
                            if(temp[k]==t){
                                temp[k]=temp[i];
                            }
                        }
                    }else{
                        if(temp[i]>0){
                            temp[j]=temp[i];
                        }else if(temp[j]>0){
                            temp[i]=temp[j];
                        }
                    }
                }  
            }
        }
        Arrays.sort(temp);
        int prev=-201;
        for(int i=0; i<n; i++){
            
            if(temp[i]!=prev){
                answer++;
                prev=temp[i];
            }
        }
       
        return answer;
    }
}