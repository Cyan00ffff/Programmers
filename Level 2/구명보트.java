import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int uIndex=0;
        int dIndex=people.length-1;
        while(uIndex<=dIndex){
            if(people[dIndex]+people[uIndex]>limit){
                dIndex--;
            }else{
                dIndex--;
                uIndex++;
            }
            answer++;
        }
        return answer;
    }
}