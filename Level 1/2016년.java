class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30,31,30,31,31,30,31,30,31};
        String[] mon={"MON", "TUE" , "WED", "THU", "FRI", "SAT", "SUN"};
        int res=3;
        for(int i=0; i<a-1; i++){
            res+=month[i];
        }
        res+=b;
        answer=mon[res%7];
        
        return answer;
    }
}