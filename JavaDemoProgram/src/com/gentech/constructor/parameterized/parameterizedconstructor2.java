package com.gentech.constructor.parameterized;



class TwoWheeler {
	String CompanyName;
	String TwoWheeler_Number;
	String Owner_name;
	int model_number;
	String Fuel;


	TwoWheeler(String CompanyName, String TwoWheeler_Number, String Owner_name, int model_number, String Fuel) {

		CompanyName = CompanyName;
		TwoWheeler_Number = TwoWheeler_Number;
		Owner_name = Owner_name;
		model_number = model_number;
		Fuel = Fuel;

		// Print details
		System.out.println("Two_Wheeler Details");
		System.out.println(CompanyName + " " + TwoWheeler_Number + " " + Owner_name + " " + model_number + " " + Fuel);
	}
}


class FourWheeler {
	String CompanyName;
	String TwoWheeler_Number;
	String Owner_name;
	int model_number;
	String Fuel;


	FourWheeler(String CompanyName, String TwoWheeler_Number, String Owner_name, int model_number, String Fuel) {

		CompanyName = CompanyName;
		TwoWheeler_Number = TwoWheeler_Number;
		Owner_name = Owner_name;
		model_number = model_number;
		Fuel = Fuel;

		System.out.println("Four_Wheeler Details");
		System.out.println(CompanyName + " " + TwoWheeler_Number + " " + Owner_name + " " + model_number + " " + Fuel);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}


class Heavy_Vehicle {
	String CompanyName;
	String TwoWheeler_Number;
	String Owner_name;
	int model_number;
	String Fuel;


	Heavy_Vehicle(String CompanyName1, String TwoWheeler_Number1, String Owner_name1, int model_number1, String Fuel1) {

		CompanyName = CompanyName1;
		TwoWheeler_Number = TwoWheeler_Number1;
		Owner_name = Owner_name1;
		model_number = model_number1;
		Fuel = Fuel1;

		System.out.println("Heavy Vehicle Details");
		System.out.println(CompanyName1 + " " + TwoWheeler_Number1 + " " + Owner_name1 + " " + model_number1 + " " + Fuel1);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

public class parameterizedconstructor2{
	public static void main(String[] args) {

		TwoWheeler v1 = new TwoWheeler("Honda", "KA123", "Rajesh", 2021, "Petrol");
		FourWheeler fv1 = new FourWheeler("MORRIS GARRAGE", "KA12356", "Rajesh", 2024, "Diesel");
		Heavy_Vehicle hv1 = new Heavy_Vehicle("Tata Motors", "KA127646", "Rajesh", 2021, "Diesel");
	}
}
