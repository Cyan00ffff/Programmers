import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int now_weight=0;
        int in=0;
        int out=0;
        Queue<Integer> queue = new LinkedList<>();
        
        while(out!=truck_weights.length){
            if(queue.peek()!=null&&answer==queue.peek()){
                queue.poll();
                now_weight-=truck_weights[out++];
            }
            if(in<truck_weights.length&&now_weight+truck_weights[in]<=weight){
                now_weight+=truck_weights[in++];
                queue.add(bridge_length+answer);
            }
            
            //System.out.println(queue);
        answer++;
        }
        
        
        return answer;
    }
}
