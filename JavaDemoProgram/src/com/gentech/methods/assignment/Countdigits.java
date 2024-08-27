package com.gentech.methods.assignment;
class count{
	void Count(int num) 
	{
		String ab=Integer.toString(num);
		int a=ab.length();
		System.out.println(a);	
	}
}
public class Countdigits {

	public static void main(String[] args) {
		count ob = new count();
		ob.Count(13244525);

	}

}
