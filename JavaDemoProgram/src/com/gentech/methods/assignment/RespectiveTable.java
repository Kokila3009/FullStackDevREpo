package com.gentech.methods.assignment;

class Tables1 {
	void Tables2(int num) {
		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " * " + i + " = " + (num * i));     
		}
	}
}
public class RespectiveTable {

	public static void main(String[] args) {
		Tables1 ob = new Tables1();
		ob.Tables2(20);
	}

}
