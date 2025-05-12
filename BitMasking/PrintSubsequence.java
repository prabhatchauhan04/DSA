package BitMasking;

/* Print all subsequences of a string without using recursion (using bit masking) */

public class PrintSubsequence {
    public static void main(String[] args) {
        String str = "abc";
		SubSequence(str);
	}
	public static void SubSequence(String str) {
		int n = str.length();
		for (int i = 0; i < (1 << n); i++) { // 1 << n  =  2ⁿ
			Print(str, i);
		}
	}
    public static void Print(String str , int i){
        int pos = 0; // pointer for traversing string str
        while (i > 0) {
            if ((i & 1) != 0) {
                System.out.print(str.charAt(pos));
            }
            i >>= 1;
            pos++;
        }
        System.out.println();
    }
}
