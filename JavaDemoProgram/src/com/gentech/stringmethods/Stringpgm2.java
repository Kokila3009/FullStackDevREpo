package com.gentech.stringmethods;

public class Stringpgm2 {
	static void StringReverse() {
		String s=new String("Programming");
		char a[]=s.toCharArray();
		for(int i=(a.length-1);i>=0;i--) {
			System.out.print(a[i]);
			
		}
		System.out.println();
		
	}
	static void StringReverse2() {
		String d=new String("Programming");
		String reverse="";
		for(int i=d.length()-1;i>=0;i--) {
			reverse+=d.substring(i, i + 1);
		}
		
		System.out.print(reverse);
		System.out.println();

	}
	static void StringReverse3() {
		String d=new String("Programming");
		String reverse="";
		for(int i=d.length()-1;i>=0;i--) {
			reverse+=d.charAt(i);
		}
		
		System.out.print(reverse);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringpgm2.StringReverse();
		Stringpgm2.StringReverse2();
		Stringpgm2.StringReverse3();
	}

}
