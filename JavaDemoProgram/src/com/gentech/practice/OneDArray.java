package com.gentech.practice;
class OneDArray1{
	int[] FirstHalf(int a[]){
		
		int c=(a.length+1)/2;
		int b[]= new int[c];
		for(int i=0;i<c;i++) {
			b[i]=a[i];
			
		}
		return b;
		
	}
}
public class OneDArray {

	public static void main(String[] args) {
		OneDArray1 ob=new OneDArray1();
		int a[]= {2,34,56,78,554,43};
		int[]res=ob.FirstHalf(a);
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);

	}

}
