package com.gentech.static1;
class Static1{
	static void add(int a,int b) {
		int res=a+b;
		System.out.println();
		
	}
	static void StringMultiply(String a) {
		String b=a+"Welcome to Full Stack Development";
		System.out.println(b);
	}
}
public class StaticVariables {

	public static void main(String[] args) {
		Static1.add(39, 32);
		Static1.StringMultiply("Kokila");
		System.out.println("Hi Kokila Welcome");
		

	}

}
