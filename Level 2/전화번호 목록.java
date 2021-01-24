import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> set = new HashSet<String>();
        for(String s : phone_book){
            
            for(int i=1; i<s.length(); i++){
                set.add(s.substring(0,i));
            }
            
        }
        for(String s:phone_book){
            if(set.contains(s)){
                System.out.println(s);
                answer=false;
                break;
            }
        }
        
        return answer;
    }
        
        
}