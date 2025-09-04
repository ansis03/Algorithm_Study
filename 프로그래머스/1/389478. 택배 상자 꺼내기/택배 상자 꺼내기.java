class Solution {
    private int answer;
    public int solution(int n, int w, int num) {
        //w가 1일 경우, n-num으로 종료
        if(w == 1){
            return answer = n-num+1;
        }
        
        int height = (n+w -1)/w;
        int[][] array = new int[w][height];
        
        int k = 1;
        
        //배열 채우기
        for(int i = 0; i<height; i++){
            for(int j = 0; j<w; j++){
                if(k>n)
                    break;
                if(isOdd(i)){
                    array[w-j-1][i] = k++;
                }else{
                    array[j][i] = k++;
                }
                
            }
            if(k>n)
                break;
        }
        
        int my_height = -1;
        int my_width = -1;
        
        // num 위치 찾기
        find_my_location:
        for(int i = 0; i<height; i++){
            for(int j = 0; j<w; j++){
                if(array[j][i] == num){
                    my_width = j;
                    my_height = i;
                    break find_my_location;
                }
            }
        }
        
        int count = 0;
        for(int i = my_height; i<height; i++){
            if(array[my_width][i] == 0){
                break;
            }
            count++;
        }
        return count;
    }
    
    private boolean isOdd(int number){
        if(number%2 == 0){
            return false;
        }else{
            return true;
        }
    }
}