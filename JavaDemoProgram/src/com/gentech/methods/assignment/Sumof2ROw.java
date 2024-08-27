package com.gentech.methods.assignment;
class TwoD1{
	void TwoDarray(double a[][])
	{
		double sum=0;
		 for (int i = 1; i <a.length; i++) {
	            for (int j = 0; j <a[1].length; j++) {
	            	
	            	sum=sum+a[i][j];
	            }
	            System.out.println("Sum is :"+sum); 
	           
	        }
		
		
	}
}
public class Sumof2ROw {

	public static void main(String[] args) {
		TwoD1 ob =new TwoD1();
		double a[][]= {{1,12,3},{2,33,4}};
		ob.TwoDarray(a);
		

	}

}
