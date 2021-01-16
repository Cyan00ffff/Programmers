import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        int[] s = new int[N+1];//단계별 도달했던 사람들 수
        int[] s2 = new int[N+1];//각 단계에 머물고 있는 사람들 수
        for(int i=0; i<N+1; i++){
            s[i]=0;
            s2[i]=0;
        }
        for(int k:stages){
            s2[k-1]++;
            for(int i=0; i<k; i++){
                s[i]++;
            }
        }
        
        float[] temp = new float[N];
        for(int i=0; i<temp.length; i++){
            if(s[i]==0)
                temp[i]=0;
            else
                temp[i]=(float)s2[i]/(float)s[i];
        }
        float[] total2=temp.clone();
        float[] total= new float[N];
        Arrays.sort(temp);
        
        for(int i=0; i<N; i++){
            total[i]=temp[N-i-1];
        }
        
       
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(total[i]==total2[j]){
                    total2[j]=-1;
                    answer[i]=j+1;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}