import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        HashMap<String, String> map = new HashMap<>();
        int size=0;
        for(String s : record){
            String[] temp = new String[3];
            temp=s.split(" ");
            switch(temp[0]){
                case "Enter":
                    map.put(temp[1],temp[2]);
                    size++;
                    break;
                case "Change":
                    map.put(temp[1],temp[2]);
                    break;
                case "Leave":
                    size++;
                    break;
            }
        }
        String[] answer = new String[size];
        int index=0;
        for(String s : record){
            String[] temp = new String[3];
            temp=s.split(" ");
            switch(temp[0]){
                case "Enter":
                    answer[index++]=map.get(temp[1])+"님이 들어왔습니다.";
                    break;
                case "Leave":
                    answer[index++]=map.get(temp[1])+"님이 나갔습니다.";
                    break;
                default: break;
            }
        }
        return answer;
    }
}