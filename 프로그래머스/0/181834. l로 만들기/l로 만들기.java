class Solution {
    public String solution(String myString) {
        char[] myArray = myString.toCharArray();
        char[] resultArray = changeMyString(myArray);
        String answer = new String(resultArray);
        return answer;
    }
    
    private char[] changeMyString(char[] myString){
        for(int i = 0; i<myString.length; i++){
            if(myString[i] < 'l'){
                myString[i] = 'l';
            }
        }
        return myString;
    }
}