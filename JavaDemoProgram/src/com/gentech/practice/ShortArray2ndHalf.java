package com.gentech.practice;
class ShortArray{
	short[] SecondHalf(short a[]) {
		int b=(a.length+1)/2;
		short[] c=new short[b];
		for(int i=b,j=0;i<a.length;i++,j++) {
			
			c[j]=a[i];
		
		}

		return c;

	}
}
public class ShortArray2ndHalf {

	public static void main(String[] args) {
		
		short s[]= {12,3,56,645,44,23,32};
		ShortArray ob = new ShortArray();
		short[] res=ob.SecondHalf(s);
		for(int i = 0;i<res.length;i++)
			System.out.println(res[i]);
	}

}
