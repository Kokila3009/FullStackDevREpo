package com.gentech.demo1;

class TwoWheeler{
	String CompanyName;
	String TwoWheeler_Number; 
	String Owner_name;
	int model_number;
	String Fuel;
	
}

class FourWheeler{
	String CompanyName;
	String TwoWheeler_Number; 
	String Owner_name;
	int model_number;
	String Fuel;
	
	
}

class Heavy_Vehicle{
	String CompanyName;
	String TwoWheeler_Number; 
	String Owner_name;
	int model_number;
	String Fuel;
	
}

public class Assignment2 {

	public static void main(String[] args) {
		
		 TwoWheeler v1 = new TwoWheeler();
		 v1. CompanyName="Honda";
		 v1.TwoWheeler_Number="KA123";
		 v1.Owner_name="Rajesh";
		 v1. model_number=2021;
		 v1. Fuel="Petrol";
				 
		FourWheeler Fv1=new FourWheeler();
		 Fv1. CompanyName="MORRIS GARRAGE";
		 Fv1.TwoWheeler_Number="KA12356";
		 Fv1.Owner_name="Rajesh";
		 Fv1. model_number=2024;
		 Fv1. Fuel="Diesel";
		
		 Heavy_Vehicle Hv1=new Heavy_Vehicle();
		 Hv1. CompanyName="Tata Motors";
		 Hv1.TwoWheeler_Number="KA127646";
		 Hv1.Owner_name="Rajesh";
		 Hv1. model_number=2021;
		 Hv1. Fuel="Diesel";
	
		System.out.println("Two_Wheeler Details");
		System.out.print(v1.CompanyName + " ");
		System.out.print(v1.TwoWheeler_Number + " ");
		System.out.print(v1.Owner_name + " ");
		System.out.print(v1.model_number + " ");
		System.out.println(v1.Fuel);

		System.out.println("Four_Wheeler Details");
		System.out.print(Fv1.CompanyName + " ");
		System.out.print(Fv1.TwoWheeler_Number + " ");
		System.out.print(Fv1.Owner_name + " ");
		System.out.print(Fv1.model_number + " ");
		System.out.println(Fv1.Fuel);

		System.out.println("Heavy Vehicle Details");
		System.out.print(Hv1.CompanyName + " ");
		System.out.print(Hv1.TwoWheeler_Number + " ");
		System.out.print(Hv1.Owner_name + " ");
		System.out.print(Hv1.model_number + " ");
		System.out.println(Hv1.Fuel);

		
		
	}

}