import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        ArrayList<Point> arr=new ArrayList<>();
        for(int i=0; i<costs.length; i++){
            for(int j=0; j<3; j++){
                arr.add(new Point(costs[i][0], costs[i][1], costs[i][2]));
            }
        }
        
        Collections.sort(arr);
        
        int[] check = new int[n];
        for(int i=0; i<n; i++){
            check[i]=-1;
        }
        
        int num=2;
        
        for(Point p : arr){
            
            if(check[p.x]!=check[p.y]||check[p.x]*check[p.y]==1){
                //둘다 연결된 edge 가 없거나 둘이 다른 그룹, 해당 edge 를 추가해야 함
                if(check[p.x]*check[p.y]>1){//둘 다 2이상
                    int temp = check[p.y];
                    for(int i=0; i<check.length; i++){
                        if(check[i]==temp){
                            check[i]=check[p.x];
                        }
                    }
                }else{//둘 한 개 이상이 -1
                    if(check[p.x]==-1&&check[p.y]==-1){
                        check[p.x]=num;
                        check[p.y]=num;
                        num++;
                    }else{
                        int temp=Math.max(check[p.x], check[p.y]);
                        check[p.x]=temp;
                        check[p.y]=temp;
                    }
                    
                }
                answer+=p.cost;

            }
            
        }
        
        return answer;
    }
}

class Point implements Comparable<Point> {
    int x, y;
    int cost;
    public Point(int x, int y, int cost){
        this.x=x;
        this.y=y;
        this.cost=cost;
    }
    @Override
    public int compareTo(Point p) {
        return this.cost-p.cost;
    }
}
