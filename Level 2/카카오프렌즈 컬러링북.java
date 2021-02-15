import java.util.*;

class Solution {
    public static int count=0;
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[][] area =new int[m][n];
        //java 이차원 배열은 Array.clone 으로 복사 안됨
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                area[i][j]=picture[i][j];
            }
        }

        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(area[i][j]>0){
                    search(i, j, m,n, picture,area, --numberOfArea);
                    if(count>maxSizeOfOneArea){
                        maxSizeOfOneArea=count;
                    }
                    count=0;
                }
            }
        }
        
        int[] answer = {0,0};
        answer[0]=-numberOfArea;
        answer[1]=maxSizeOfOneArea;
        return answer;
    }
    
    
    public void search(int i, int j, int m, int n, int[][] picture, int[][] area, int color){
        int[][] index = {{i-1,j},{i,j-1},{i,j+1},{i+1,j}};
        area[i][j]=color;
        count++;
        for(int k=0; k<4; k++){
            int row=index[k][0];
            int col=index[k][1];
            if(row>=0&&row<m&&col>=0&&col<n){//유효한 index이고
                if(area[row][col]>0){//아직 처리되지 않은 같은 색
                    if(picture[row][col]==picture[i][j]){
                        search(row, col, m, n, picture,area, color);
                    }
                }
            }
            
        }
    }
}