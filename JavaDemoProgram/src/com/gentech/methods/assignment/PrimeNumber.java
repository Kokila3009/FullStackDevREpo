package com.gentech.methods.assignment;

class Prime {
    void checkPrime(int st, int stp) {
        for (int i = st; i <= stp; i++) {
            if (i <= 1) continue;
            
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(i + " is a Prime Number");
            }
        }
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        Prime ob = new Prime();
        ob.checkPrime(1, 50);
    }
}
