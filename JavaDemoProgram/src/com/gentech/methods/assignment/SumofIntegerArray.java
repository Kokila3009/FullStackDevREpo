package com.gentech.methods.assignment;
class Sum{
	void sum1(int a[]) {
		int sum2=0;
		for(int i=1;i<a.length;i++) {
			sum2=sum2+a[i];
			
		}
		System.out.println(sum2);
		
	}
}
public class SumofIntegerArray {

	public static void main(String[] args) {
		int arr[]= {1,23,50,46,43,345,6765,335};
		Sum ob =new Sum();
		ob.sum1(arr);

	}

}
