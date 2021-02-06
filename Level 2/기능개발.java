import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            int t=0;
            while(progresses[i]<100){
                progresses[i]+=speeds[i];
                t++;
            }
            queue.offer(t);
        }
        ArrayList<Integer> list = new ArrayList<>();

        while(queue.peek()!=null){
            int t = queue.poll();
            int num=1;
            
            while(queue.peek()!=null&&queue.peek()<=t){
                queue.poll();
                num++;
            }
            list.add(num);
        }
        
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}