package SlidingWindow;

/* 
   Given : A string that only contains characters 'a' and 'b'.
          'k' = Maximum Number of Characters that can be changed
            
           We have to find the "Maximum Length Substring of equal characters" 
           by changing no more than 'k' characters.
 */

public class MaximumLengthSubstringEqualCharacters {
    public static void main(String[] args) {
        String s = "aabababbaaaaaaaabababbaa";
        int k = 3;

        int flipa = maxlen(s , k , 'a');
        int flipb = maxlen(s , k , 'b');

        System.out.println(Math.max(flipa , flipb));
    }

    public static int maxlen(String s , int k , char ch){
        int i = 0;
        int j = 0;
        int flip = 0;
        int ans = 0;

        while (j < s.length()) {

            // Growing 
            if (s.charAt(j) == ch) {
                flip++;
            }

            // Shrinking
            while (flip > k) {
                if (s.charAt(i) == ch) {
                    flip--;
                }
                i++;
            }

            // Answer
            ans = Math.max(ans , j-i+1);

            j++;
        }

        return ans;
    }
}
