package BitMasking;

/* Check if a given number is odd or even without using any mathematical operator. */

public class Odd_Even {
    public static void main(String[] args) {
        int n = 7;
		if ((n & 1) != 0) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
    }
}
