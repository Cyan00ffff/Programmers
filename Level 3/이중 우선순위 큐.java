import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        int count=0;
        
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        String[] temp;
        
        for(int i=0; i<operations.length; i++){
            temp=operations[i].split(" ");

            switch(temp[0]){
                case "I":
                    maxQueue.add(Integer.parseInt(temp[1]));
                    minQueue.add(Integer.parseInt(temp[1]));
                    count++;
                    break;
                case "D":
                    if(count==0)
                        break;
                    if(temp[1].equals("1")){
                        minQueue.remove(maxQueue.poll());
                    }else{
                        maxQueue.remove(minQueue.poll());
                    }
                    count--;
                    break;
            }
            
        }
        
        if(count==0){
            answer=new int[2];
            answer[0]=0;
            answer[1]=0;
        }
        else{
            answer=new int[2];
            answer[0]=maxQueue.poll();
            answer[1]=minQueue.poll();
        }
        return answer;
    }
}