package com.gentech.practice;

class square2{
	int[] squareno(int st,int stp) {
		int b[]=new int[(stp-st)+1];
		for(int i=st,j=0;i<=stp;i++,j++) {
			
			int sq=i*i;
			b[j]=sq;
			
		}
		return b;
		
	}
}
public class Square22 {

	public static void main(String[] args) {
		square2 ob = new square2();
		int []res=ob.squareno(1, 10);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

}
