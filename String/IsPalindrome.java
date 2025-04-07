package String;

public class IsPalindrome {
    public static void main(String[] args) {
        String s1 = "naan";
        System.out.println(checkifitisPalindrome(s1));

        String s2 = "never";
        System.out.println(checkifitisPalindrome(s2));
    }

    public static boolean checkifitisPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
