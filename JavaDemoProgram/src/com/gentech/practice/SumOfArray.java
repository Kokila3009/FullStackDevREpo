package com.gentech.practice;
class Sum{
	int sum(int a[]) {
		int sum1=0;
		for (int i=0;i<a.length;i++) {
			sum1=a[i]+sum1;
		}
		
		return sum1;
		
	}
}
public class SumOfArray {

	public static void main(String[] args) {
		int b[]= {1,2,3,34,32,23};
		Sum ob=new Sum();
		int res=ob.sum(b);
		System.out.println(res);
		

	}

}
