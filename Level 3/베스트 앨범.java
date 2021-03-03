import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Genre> map = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            String g = genres[i];
            int p = plays[i];
            int f,s;
            if(map.containsKey(g)){
                f=map.get(g).first;
                s=map.get(g).second;
                
                if(f==s){
                    if(p>plays[f]){
                        map.get(g).second=f;
                        map.get(g).first=i;
                    }else{
                        map.get(g).second=i;
                    }
                    map.get(g).total+=p;
                    continue;
                }
                if(p>plays[f]){
                    map.get(g).second=f;
                    map.get(g).first=i;
                }else if(p<=plays[f]&&p>plays[s]){
                    map.get(g).second=i;
                }
                map.get(g).total+=plays[i];
            }else{
                map.put(g, new Genre(plays[i], i,i));
            }
        }
        
        List<Map.Entry<String, Genre>> list = new ArrayList<Map.Entry<String, Genre>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Genre>>() {
			public int compare(Map.Entry<String, Genre> obj1, Map.Entry<String, Genre> obj2)
			{
				return obj2.getValue().total-obj1.getValue().total;
			}
		});
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            Genre g = list.get(i).getValue();
            if(g.first==g.second)
                arr.add(g.first);
            else{
                arr.add(g.first);
                arr.add(g.second);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
}

class Genre{
    public int total;
    public int first;
    public int second;
    public Genre(int total, int first, int second){
        this.total=total;
        this.first=first;
        this.second=second;
    }
   
}