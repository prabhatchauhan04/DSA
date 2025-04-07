package Basics;

public class HCF {
    public static void main(String[] args) {
        int divisor = 36;
        int dividend = 60;

        // while (dividend % divisor != 0) {
        //     int remainder = dividend % divisor;
        //     dividend = divisor;
        //     divisor = remainder;
        // }
        
        for ( ; dividend % divisor != 0 ; ) {
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println("HCF is : " + divisor);
    }
}
