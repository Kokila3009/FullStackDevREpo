package com.gentech.constructor.noargs;


class TwoWheeler{
	String CompanyName;
	String TwoWheeler_Number; 
	String Owner_name;
	int model_number;
	String Fuel;
	TwoWheeler(){
		CompanyName="Honda";
		TwoWheeler_Number="KA123";
		Owner_name="Rajesh";
		model_number=2021;
		Fuel="Petrol";
		System.out.println("****Two_Wheeler Details****");
		System.out.println( CompanyName +" "+
				TwoWheeler_Number+" "+
				Owner_name+" "+
				model_number+" "+
				Fuel
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}

}

class FourWheeler{
	String CompanyName;
	String TwoWheeler_Number; 
	String Owner_name;
	int model_number;
	String Fuel;
	FourWheeler(){
		CompanyName="MORRIS GARRAGE";
		TwoWheeler_Number="KA12356";
		Owner_name="Rajesh";
		model_number=2024;
		Fuel="Diesel";

		System.out.println("****Four_Wheeler Details****");
		System.out.println( CompanyName +" "+
				TwoWheeler_Number +" "+
				Owner_name +" "+
				model_number +" "+
				Fuel);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}



}

class Heavy_Vehicle{
	String CompanyName;
	String TwoWheeler_Number; 
	String Owner_name;
	int model_number;
	String Fuel;
	Heavy_Vehicle(){
		CompanyName="Tata Motors";
		TwoWheeler_Number="KA127646";
		Owner_name="Rajesh";
		model_number=2021;
		Fuel="Diesel";
		System.out.println("****Heavy Vehicle Details****");
		System.out.println( CompanyName +" "+
				TwoWheeler_Number +" "+
				Owner_name +" "+
				model_number +" "+
				Fuel);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}

}

public class  Constructorassignment2{

	public static void main(String[] args) {

		TwoWheeler v1 = new TwoWheeler();


		FourWheeler Fv1=new FourWheeler();


		Heavy_Vehicle Hv1=new Heavy_Vehicle();

	}

}