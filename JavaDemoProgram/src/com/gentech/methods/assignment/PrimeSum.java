package com.gentech.methods.assignment;
class PrimeASum1{
    void checkPrime(int st, int stp) {
    	int sum=0;
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
            
                sum=sum+i;
            }
            
        }
        System.out.println(sum);
    }
}





public class PrimeSum{

	public static void main(String[] args) {
		PrimeASum1 ob = new PrimeASum1();
	        ob.checkPrime(1,100);
		

	}

}
