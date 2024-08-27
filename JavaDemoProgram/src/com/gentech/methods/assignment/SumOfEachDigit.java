package com.gentech.methods.assignment;
class SumDigits{
	void SumOfD(int num){
		int sum=0;
		while(num>0) {
			sum=sum+(num%10);
			System.out.println(sum);
			num/=10;
			System.out.println(num);
		}
			
			
		}
	
}
public class SumOfEachDigit {
	public static void main(String args[]){

		SumDigits ob =new SumDigits();
		ob.SumOfD(23334);
		System.out.println(23334/10);
	}

}
