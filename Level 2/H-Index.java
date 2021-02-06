import java.util.*;

class Solution {
    
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;

        Arrays.sort(citations);
        
        for(int h=0; h<=citations[n-1]; h++){
            int ind=0;
            while(ind<n&&citations[ind]<h)
                ind++;//h번 미만 인용된 논문 개수
            if(n-ind>=h)//그게 h 보다 크면
                answer=h;
        }
        
        
        return answer;
    }
    
}