package DP;

/* Given n wines in a row, with integers denoting the cost of each wine respectively. Each year you can 
sale the first or the last wine in a row. However, the price of wines increases over time. Let the initial 
profits from the wines be P1, P2, P3…Pn. In the Yth year, the profit from the ith wine will be Y*Pi. 
Calculate the maximum profit from all the wines. */

public class WineProblem {
    public static void main(String[] args) {
		int[] wine = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		System.out.println(maximum_profitTD(wine, 0, wine.length - 1, 1, dp));
		System.out.println(maximum_profitBU(wine));
	}
	public static int maximum_profitTD(int[] wine, int i, int j, int year, int[][] dp) {
		if (i > j) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int left = wine[i] * year + maximum_profitTD(wine, i + 1, j, year + 1, dp);
		int right = wine[j] * year + maximum_profitTD(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(left, right);
	}
	public static int maximum_profitBU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
        // last year ka filled
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = wine[i] * wine.length;
        }
        int year = wine.length-1;
        for (int d = 1; d < wine.length; d++) { // d -> diagonal
            for (int j = d; j < dp.length; j++) {
                int i = j - d;
                int left = wine[i] * year + dp[i+1][j];
		        int right = wine[j] * year + dp[i][j-1];
		        dp[i][j] = Math.max(left, right);
            }
            year--;
        }
        return dp[0][dp.length-1];
	}
}





