import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        String prev=words[0].substring(0,1);
        
        Set<String> set = new HashSet<>();
        for(int i=0; i<words.length; i++){
            if(set.contains(words[i])||prev.charAt(prev.length()-1)!=words[i].charAt(0)){
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }else{
                set.add(words[i]);
                prev=words[i];
            }
        }

        return answer;
    }
}