package com.gentech.static1;
class Reccursion{
	int Factorial(int num) {
		if(num==1) {
			return 1;
		}
		return num*Factorial(num-1);	
	}
	
}
public class Recurssion {

	public static void main(String[] args) {
		Reccursion ob=new Reccursion();
		int v=ob.Factorial(10);
		System.out.println(v);

	}

}
