import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(0);
        
        for(int i=0; i<dartResult.length(); i++){
            char temp=dartResult.charAt(i);
            
            if((temp>='2'&&temp<='9')||temp=='0')
                stack.push((int)temp-48);
            else{
                int res=0;
                int res2=0;
                switch(temp){
                case '1':
                    if(dartResult.charAt(i+1)=='0'){
                        stack.push(10);
                        i++;
                    }
                    else
                        stack.push(1);
                    break;
                case 'S':
                        res=(int)Math.pow(stack.pop(),1);
                        stack.push(res);
                        break;
                case 'D':
                        res=(int)Math.pow(stack.pop(),2);
                        stack.push(res);
                        break;
                case 'T':
                        res=(int)Math.pow(stack.pop(),3);
                        stack.push(res);
                        break;
                case '*':
                        res=stack.pop()*2;
                        res2=stack.pop()*2;
                        stack.push(res2);
                        stack.push(res);
                        break;
                case '#':
                        res=stack.pop()*(-1);
                        stack.push(res);
                        break;
                }
            }
        }
        
        while(!stack.empty()){
            answer+=stack.pop();
        }
        
        return answer;
    }
}