class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            answer+=ceaser(s.charAt(i),n);
        }
        return answer;
    }
    
    public char ceaser(char c, int n){

        int ascii = (int)c;
        
        if(ascii>=65&&ascii<=90){
            if(ascii+n>90)
                return (char)(64+(ascii+n)%90);
            else
                return (char)(ascii+n);
        }
        if(ascii>=97&&ascii<=122){
            if(ascii+n>122)
                return (char)(96+(ascii+n)%122);
            else
                return (char)(ascii+n);
        }
        return ' ';
    }
}