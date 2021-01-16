import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {


        Comparator<String> com1 = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String c=s1.substring(n,n+1)+s1;
                String d=s2.substring(n,n+1)+s2;
                return c.compareTo(d);
            }
        };
        
        Arrays.sort(strings, com1);
        
       
        return strings;
    }
    
   
}