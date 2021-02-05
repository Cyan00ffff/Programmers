import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] alp = new char[skill.length()];
        Set<Character> set = new HashSet<>();
        for(int i=0; i<skill.length(); i++){
            alp[i]=skill.charAt(i);
            set.add(alp[i]);
        }
        for(String s : skill_trees){
            int index=0;
            boolean ok=true;
            for(int i=0; i<s.length(); i++){
                if(set.contains(s.charAt(i))){
                    if(alp[index++]!=s.charAt(i)){
                        ok=false;
                        break;
                    }
                }
            }
            if(ok)
                answer++;
            
        }
        return answer;
    }
}