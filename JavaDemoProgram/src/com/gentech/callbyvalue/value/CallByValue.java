package com.gentech.callbyvalue.value;
class Callbyvalue1{
	void calc(int a,int b) {
		a=a+b;
		b=b*5;
		if(a>=0) {
			System.out.println(a+"within method");
			System.out.println(b+"within method");	
		}
	}
}
public class CallByValue {

	public static void main(String[] args) {
	int a=5;
	int b=6; 
	Callbyvalue1 ob =new Callbyvalue1();
	ob.calc(a,b);
	System.out.println(a);
	System.out.println(b);

	}

}
