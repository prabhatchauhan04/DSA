package BitMasking;

/* Magic Number Question
A magic number is defined as a number that can be expressed as a power of 5 or sum of unique powers of 5. 
First few magic numbers are 5, 25, 30 = (5 + 25), 125, 130 = (125 + 5), …
Given the value of n, find the n'th Magic number.
Example 1:
Input: n = 1
Output: 5
Explanation: 1'st Magic number is 5.
Example 2:
Input: n = 2
Output: 25
Explanation: 2'nd Magic number is 25. 
*/
public class MagicNumber {
    public static void main(String[] args) {
        int n = 11;
		System.out.println(Nth_Magic_Number(n));
	}
	public static int Nth_Magic_Number(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
            // int rem = n % 2;
        	// ans = ans + rem * mul;
			if ((n & 1) != 0) {
				ans = ans + mul;
			}
			mul *= 5;
			n >>= 1;// same as n = n / 2;
		}
		return ans;
	}
}





