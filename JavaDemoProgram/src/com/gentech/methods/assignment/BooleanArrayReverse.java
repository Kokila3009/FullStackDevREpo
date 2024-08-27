package com.gentech.methods.assignment;
class Boolean1{
	void Boolean(boolean a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		
	}
}
public class BooleanArrayReverse {
	public static void main(String args[]) {
		boolean arr[]= {true,false,true,true,false,true};
		Boolean1 ob= new Boolean1();
		ob.Boolean(arr);
		
		
	}
}
