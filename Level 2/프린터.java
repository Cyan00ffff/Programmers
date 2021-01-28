import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Print> pqueue = new PriorityQueue<>();
        Queue<Print> queue = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            pqueue.offer(new Print(i, priorities[i]));
            queue.offer(new Print(i, priorities[i]));
        }
        while(true){
            Print temp=pqueue.poll();

            while(queue.peek().pri<temp.pri){
                queue.offer(queue.poll());
            }
            answer++;
            Print temp2=queue.poll();
            if(temp2.loc==location){
                break;
            }
        }
        return answer;
    }
}

class Print implements Comparable<Print>{
    int loc;
    int pri;
    public Print(int loc, int pri){
        this.loc=loc;
        this.pri=pri;
    }
    
    @Override
    public int compareTo(Print target) {
        return this.pri <= target.pri ? 1 : - 1;
    }
}