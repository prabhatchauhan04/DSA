package BitMasking;

import java.util.Scanner;

/* https://codeforces.com/problemset/problem/535/B 
 Codeforces problem Tavas and SaDDas
You are given a lucky number n. Lucky numbers are the positive integers whose decimal representations contain 
only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
If we sort all lucky numbers in increasing order, what's the 1-based index of n?
Tavas is not as smart as SaDDas, so he asked you to do him a favor and solve this problem so he can have his headphones back.
Input
The first and only line of input contains a lucky number n (1 ≤ n ≤ 109).
Output
Print the index of n among all lucky numbers.
*/

public class TavasSaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(index(s));
        sc.close();
    }
    public static int index(String str) {
		int n = str.length();
		int count = (1 << n) - 2;// n-1 len tk ke count
		int pos = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == '7') {
				count += (1 << pos); // same as count += (2) ki power (pos)
			}
			pos++;
		}
		return count + 1;
	}
}




