package BitMasking;

// Counting no. of set bits (1) in a number n 

public class CountNumberOfSetBit {
    public static void main(String[] args) {
        int n = 75;
		System.out.println(CountSetBit(n));
		System.out.println(FastCountSetBit(n));
    }
    public static int CountSetBit(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n >>= 1;  // this is same as n = n >> 1;
        }
        return count;
    }
    public static int FastCountSetBit(int n){
        int c = 0;
		while (n > 0) {
			c++;
			n = (n & (n - 1));
		}
		return c;
    }
}



