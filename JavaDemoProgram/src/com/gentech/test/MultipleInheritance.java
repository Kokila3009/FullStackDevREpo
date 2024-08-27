package com.gentech.test;
class  Vehicle{
	Vehicle(String Companyname,int ModelNumber)
	{
		
		System.out.println("Companyname :  "+Companyname);
		System.out.println("ModelNumber :  "+ModelNumber);
		System.out.println("*************************************");
	}
	
}
class  Car extends Vehicle{

	Car(String Companyname, int ModelNumber) {
		super(Companyname, ModelNumber);
		
	System.out.println("This is class car");
	}
	
}

class Auto extends Car{

	Auto(String Companyname, int ModelNumber) {
		super(Companyname, ModelNumber);
		System.out.println("This is class Auto");
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Auto ob = new Auto( "Mahindra",2763863);
		
		
		

	}

}
