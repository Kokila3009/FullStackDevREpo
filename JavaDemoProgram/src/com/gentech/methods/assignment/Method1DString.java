package com.gentech.methods.assignment;
class Array2Half{
	void Display( String a[]) {
		 int half=a.length/2;
		for(int i=half;i<a.length;i++)
		{
	    System.out.println(a[i]);
	     
	     }
	}
}
public class Method1DString {

	public static void main(String[] args) {
		String arra[] = {"apple","Mango","Pineapple","Banana","Grapes","orange"};
		Array2Half ob =new Array2Half ();
	
		ob.Display(arra);
		
	}

}