package com.gentech.methods.assignment;
class cube{
	void Cube(int a[]) {
		for(int i=0;i<a.length;i++) {
			int res=a[i];
			int cube1=res*res*res;
			
			System.out.println(cube1);
			
		}
		
	}
}
public class CubeOfEachElementInArray {

	public static void main(String[] args) {
		cube ob =new cube();
		int a[]= {1,2,3,5};
		ob.Cube(a);

	}

}
