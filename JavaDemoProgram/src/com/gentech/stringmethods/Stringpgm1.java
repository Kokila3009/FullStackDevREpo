package com.gentech.stringmethods;

public class Stringpgm1 {
	static void Stringlen() {
		String s=new String("Welcome");
		char a[]=s.toCharArray();
		int count=0;
		for(@SuppressWarnings("unused") char i:a) {
			
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Stringpgm1.Stringlen();
		 
	}

}
