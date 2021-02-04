import java.util.*;

class Solution {
    
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        boolean one=false;
        for(int i=0; i<scoville.length; i++){
            heap.add(scoville[i]);
        }
        
        while(heap.peek()<K){
            int n1=heap.poll();
            int n2=heap.poll();
            heap.add(n1+n2*2);
            answer++;
            if(answer==scoville.length-1){
                one=true;
                break;
            }
            
        }
        
        if(one){
            if(heap.peek()<K){
                answer=-1;
            }
        }
        
        return answer;
    }
}