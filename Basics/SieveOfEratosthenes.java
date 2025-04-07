package Basics;

// 1 to n tk saare prime numbers print krwane hai 

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;
        PrimeSieve(n);
    }
    // if prime[i] = true then 'i' is not prime.
    // if prime[i] = false then 'i' is prime .
    public static void PrimeSieve(int n){
        boolean [] prime = new boolean[n + 1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2 ; i*i <= n ; i++) {
            if (prime[i] == false) {
                for (int j = 2; j*i < prime.length; j++) {
                    prime[i*j] = true;
                }
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == false) {
                System.out.print(i + " ");
            }
        }
    }
}
