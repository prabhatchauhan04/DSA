package String;

public class printSubstrings {
    public static void main(String[] args) {
        String s = "Hello";

        printSubstringFunc(s);
    }

    public static void printSubstringFunc(String s){
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1 ; j <= s.length() ; j++) {
                System.out.print( s.substring(i , j) + " " );
            }
        }
    }
    
}
