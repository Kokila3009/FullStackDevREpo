package com.gentech.stringmethods;

public class Stringpgm3 {
	
		static void StringReverse() {
			String s=new String("Programming");
			char a[]=s.toCharArray();
			for(int i=(a.length-1);i>=0;i--) {
				System.out.print(a[i]);
				
			}
			System.out.println();
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringpgm3.StringReverse();
	}

}
