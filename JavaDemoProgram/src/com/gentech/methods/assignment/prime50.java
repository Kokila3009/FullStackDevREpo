package com.gentech.methods.assignment;


class Prime11{
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
                System.out.println(i );
            }
        }
    }
}



public class prime50 {

	public static void main(String[] args) {
		 Prime11 ob = new Prime11();
	        ob.checkPrime(50, 150);

	}

}
