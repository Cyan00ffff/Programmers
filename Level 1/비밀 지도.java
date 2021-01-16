class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String temp="";
            int temp1[]=tenToTwo(n, arr1[i]);
            int temp2[] = tenToTwo(n, arr2[i]);
            for(int j=0; j<n; j++){
                if(temp1[j]+temp2[j]==0){
                    temp+=" ";
                }else
                    temp+="#";
            }
            answer[i]=temp;
        }
        return answer;
    }
    public int[] tenToTwo(int n, int num){
        int[] ret = new int[n];
        for(int i=n-1; i>=0; i--){
            ret[i]=num%2;
            num=num/2;
        }
        return ret;
    }
}