class Solution {
    public int[] solution(int[] answers) {
        int[] supo = new int[3];
        for(int i=0; i<3; i++){
            supo[i]=0;
        }
        int numOne=1;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==numOne)
                supo[0]++;
            numOne++;
            if(numOne==6)
                numOne=1;
        }
        
        int[] numTwo = {2,1,2,3,2,4,2,5};
        for(int i=0; i<answers.length; i++){
            if(answers[i]==numTwo[i%8])
                supo[1]++;
        }
        
        int[] numThree={3,3,1,1,2,2,4,4,5,5};
        for(int i=0; i<answers.length; i++){
            if(answers[i]==numThree[i%10])
                supo[2]++;
        }
        
        int biggest = 0;
        for(int i=0; i<3; i++){
            if(supo[i]>=biggest)
                biggest=supo[i];
        }
        int size=0;
        for(int i=0; i<3; i++){
            if(supo[i]==biggest)
                size++;
        }
        int[] answer = new int[size];
        int index=0;
        for(int i=0; i<3; i++){
            if(supo[i]==biggest)
                answer[index++]=i+1;
        }
        return answer;
    }
}