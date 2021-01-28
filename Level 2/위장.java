import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                int temp=map.get(clothes[i][1])+1;
                map.put(clothes[i][1],temp);
            }else{
                map.put(clothes[i][1], 1);
            }
        }
        answer=1;
		
		// 결과 출력
		for (String nKey : map.keySet())
		{
			answer=answer*(map.get(nKey)+1);
            System.out.println(map.get(nKey));
		}
        answer--;
        return answer;
    }
}