package String;

public class PrintSubstringLengthwise {
    public static void main(String[] args) {
        String s = "abcd";
        printSubstringFuncOne(s);

        System.out.println();
        
        printSubstringFuncTwo(s);
    }

    public static void printSubstringFuncOne(String s){

        for (int len = 1 ; len <= s.length() ; len++) {

            int i = 0;
            int j = len;

            while (j <= s.length()) {
                System.out.print(s.substring(i , j) + " ");
                i++;
                j++;
            }

        }
    }

    public static void printSubstringFuncTwo(String s){

        for (int len = 1 ; len <= s.length() ; len++) {
            
            for (int j = len ; j <= s.length() ; j++) {

                int i = j - len;
                System.out.print(s.substring(i , j) + " ");
            
            }

        }

    }
}
