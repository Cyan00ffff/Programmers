import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num=new String[numbers.length];
        Boolean isZero=true;
        
        for(int i=0; i<numbers.length; i++){
            num[i]=Integer.toString(numbers[i]);
        }
        
        Comparator<String> com = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String temp = s1+s2;
                String temp2=s2+s1;
                int l=9-temp.length();
                for(int i=0; i<l; i++){
                    temp+="0";
                    temp2+="0";
                }
                if(temp2.equals(temp))
                    return s1.length()-s2.length();
                return temp2.compareTo(temp);
            }
        };

        Arrays.sort(num, com);
        
        for(String temp : num){
            if(!temp.equals("0")){
                isZero=false;
            }
            answer+=temp;
        }
        if(isZero)
            return "0";
        return answer;
    }
}
