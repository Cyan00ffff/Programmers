class Solution {
    public String solution(int n) {
        String answer = "";
        String temp="";
        
        boolean change=false;
        while(n>0){
            change=false;
            switch(n%3){
                case 0:
                    temp+="4";
                    change=true;
                    break;
                case 1:
                    temp+="1";
                    break;
                case 2:
                    temp+="2";
                    break;
            }
            n/=3;
            if(change)
                n--;
        }
        for(int i=temp.length()-1; i>=0; i--){
            answer+=Character.toString(temp.charAt(i));
        }
        
        return answer;
    }
}