package Basics;

// Advanced version of checking if a number is prime or not !

    public class Check_Prime {

        public static void main(String[] args) {
            int n = 79;  // Test the method with a prime number
            System.out.println(IsPrime(n));  // Expected output: true
        }
    
        public static boolean IsPrime(int n) {
            // Handle edge cases: numbers less than or equal to 1 are not prime
            if (n <= 1) {
                return false;
            }
    
            // Check divisibility from 2 to sqrt(n)
            int div = 2;
            while (div * div <= n) {  // Loop runs from 2 up to sqrt(n)
                if (n % div == 0) {  // If divisible, n is not prime
                    return false;  // n is divisible by div, hence not prime
                }
                div++;  // Try next divisor
            }
    
            // If no divisors are found, n is prime
            return true;
        }
}
