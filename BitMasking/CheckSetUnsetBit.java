package BitMasking;

/* Check if ith bit of a number n is set (1) or unset (0) */
  
public class CheckSetUnsetBit {
    public static void main(String[] args) {
        int n = 75;
		int i = 3;
		int mask = 1 << i;
		if ((n & mask) != 0) {
			System.out.println("Set hai (set)");
		} else {
			System.out.println("Set nhi hai (Unset)");
		}
    }
}
