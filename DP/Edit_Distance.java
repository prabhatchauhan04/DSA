package DP;

/* https://www.spoj.com/problems/EDIST/

EDIST - Edit distance 
You are given two strings, A and B. Answer, what is the smallest number of operations you need to
transform A to B?
Operations are:
Delete one letter from one of strings
Insert one letter into one of strings
Replace one of letters from one of strings with another letter
Input
T - number of test cases
For each test case:
String A
String B
Both strings will contain only uppercase characters and they won't be longer than 2000 characters. 
There will be 10 test cases in data set.
Output
For each test case, one line, minimum number of operations.
Example
Input:
1
FOOD
MONEY
Output:
4 */

public class Edit_Distance {
    public static void main(String[] args) {
        String s = "FOOD";
        String t = "MONEY";  
        System.out.println(Editdistance(s, t, 0, 0));  
    }
    // i--> s
    // j--> t	
	public static int Editdistance(String s, String t, int i, int j) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int ans = 0;
		// dp table bilkul lcs wali hi bnegi
		if (s.charAt(i) == t.charAt(j)) {
			ans = Editdistance(s, t, i + 1, j + 1);// dp[i-1][j-1]
		} else {
			int D = Editdistance(s, t, i + 1, j);// dp[i-1][j]
			int I = Editdistance(s, t, i, j + 1);// dp[i][j-1]
			int R = Editdistance(s, t, i + 1, j + 1);// dp[i-1][j-1]
			ans = 1 + Math.min(I, Math.min(D, R));

		}
		return ans;
	}
}
