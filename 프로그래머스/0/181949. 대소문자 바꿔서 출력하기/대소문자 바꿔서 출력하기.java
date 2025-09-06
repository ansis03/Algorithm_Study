import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] toChar = a.toCharArray();
        char[] c = changeString(toChar);
        String b = new String(c);
        System.out.println(b);
    }
    
    private static char[] changeString(char[] lang){
        for(int i = 0; i<lang.length; i++){
            if(lang[i]>='a' && lang[i]<='z'){
                lang[i] = (char)(lang[i]-('a'-'A'));
            }
            else if(lang[i]>='A' && lang[i]<='Z'){
                lang[i] = (char)(lang[i]+('a'-'A'));
            }
        }
        return(lang);
    }
}