package com.gentech.constructor.parameterized;



class Country {
	String Country_name;
	String capital;
	long population;
	String area;
	String currency;

	Country(String CountryName, String Capital, long Population, String Area, String Currency) {
		Country_name = CountryName;
		capital = Capital;
		population = Population;
		area = Area;
		currency = Currency;
		System.out.println("***Country Details***");
		System.out.println(Country_name + " " + capital + " " + population + " " + area + " " + currency);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class State {
	String State_name;
	long population;
	String area;
	String Country_Name;

	State(String StateName, long Population, String Area, String CountryName) {
		State_name = StateName;
		population = Population;
		area = Area;
		Country_Name = CountryName;
		System.out.println("***State Details***");
		System.out.println(State_name + " " + population + " " + area + " " + Country_Name);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class District {
	String District_name;
	long population;
	String area;
	String State_Name;

	District(String DistrictName, long Population, String Area, String StateName) {
		District_name = DistrictName;
		population = Population;
		area = Area;
		State_Name = StateName;
		System.out.println("***District Details***");
		System.out.println(District_name + " " + population + " " + area + " " + State_Name);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class Village {
	String Village_name;
	long population;
	String area;
	String District_Name;

	Village(String VillageName, long Population, String Area, String DistrictName) {
		Village_name = VillageName;
		population = Population;
		area = Area;
		District_Name = DistrictName;
		System.out.println("****Village Details****");
		System.out.println(Village_name + " " + population + " " + area + " " + District_Name);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

public class parameterizedconstructor3 {
	public static void main(String[] args) {
		Country c1= new Country("India", "New Delhi", (long) 141.72, "3.287 million km²", "Rupees");
		State s1 = new State("Karnataka", (long) 6.446, "191,791 km²", "India");
		District d1 = new District("Mandya", (long) 3.5, "20.4 km²", "Karnataka");
		Village v1 = new Village("Kestur", 3000, "3.5 km²", "Mandya");
	}
}
