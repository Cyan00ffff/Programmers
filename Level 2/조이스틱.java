import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        String def="";
        for(int i=0; i<name.length(); i++){
            def+="A";
        }//def = 초기 A로만 이루어진 String
        
        //ABAAAAAC 경우 > < < 가 최소임
        
        int minMove=0;
        char[] temp=name.toCharArray();
        int index=0;
        temp[0]='A';
        while(!def.equals(new String(temp))){
            int[] t = getCloserIndex(temp, index);
            minMove+=t[1];
            index=t[0];
            temp[index]='A';

        }

        
            
        for(int i=0; i<name.length(); i++){
            char t = name.charAt(i);
            if((int)t>77){//77=M
                answer+=26-((int)t-65);
            }else{
                answer+=(int)t-65;
            }
        }
            
        answer+=minMove;
        
        return answer;
    }
    public int[] getCloserIndex(char[] temp, int index){
        int right=1;
        int left=1;
        int rInd=index;
        int lInd=index;
        int[] ret = new int[2];
        while(true){
            rInd++;
            rInd%=temp.length;
            if(temp[rInd]=='A')
                right++;
            else
                break;
        }
        while(true){
            lInd--;
            if(lInd<0){
                lInd+=temp.length;
            }
            if(temp[lInd]=='A')
                left++;
            else
                break;
        }
        
        
        if(right<=left){
            index+=right;
            index%=temp.length;
            ret[0]=index;
            ret[1]=right;
            
        }else{
           index-=left;
            if(index<0)
                index+=temp.length;
            ret[0]=index;
            ret[1]=left;
        }
        //System.out.println(right+" : "+left+"-"+ret[0]+"-"+ret[1]);
        return ret;
    }
}