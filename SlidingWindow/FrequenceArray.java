package SlidingWindow;

/* Small alphabets ka use krke koi String banadi h.
   Ab ek jitne alphabets hote hai utne size ka array lenge jismein index 0 pr "a" alphabet ki frequency in that 
   string represent hogi , index 1 pr "b" ki frequency and so on.
*/

public class FrequenceArray {
    public static void main(String[] args) {
        String s = "fhaebizaenbiwozqpmasjkzwertyuioplkjhgfdsazxcvbnm";
        int[] freq = new int[26];

        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
    }
}
