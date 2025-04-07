package String;

public class EqualsMethod {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        System.out.println(checkIfEqual(s1 , s2));
    }

    public static boolean checkIfEqual(String s1 , String s2){

        if (s1 == s2) {
            return true;
        }

        if (s1.length() != s2.length()) {
            return false;           
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }

        }

        return true;

    }
}