package String;

public class compareFunction {
    public static void main(String[] args) {
        String s1 = "raja";
        String s2 = "rajesh";

        System.out.println(s1.compareTo(s2));

        System.out.println(compareFunc(s1 , s2)); // khud ka compareTo() function
    }

    public static int compareFunc(String s1 , String s2){
        if (s1 == s2) {
            return 0;
        }

        int len = Math.min(s1.length() , s2.length()); 

        for (int i = 0 ; i < len ; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return s1.length() - s2.length();
    
    }
}
