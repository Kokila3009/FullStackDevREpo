package com.gentech.constructor.noargs;


class Country{

	String Country_name;
	String capital;
	long population;
	String area;
	String currency;	
	Country(){
		Country_name="India";
		capital="New Delhi";
		population=(long) 141.72 ;
		area ="3.287 million km²";
		currency="Rupees";	
		System.out.println("***Country Details***");
		System.out.println( Country_name + " "+
				capital + " "+
				population + " "+
				area + " "+
				currency	  
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}
}

class State{
	String State_name;
	long population;
	String area;
	String Country_Name;
	public long Population;
	State(){
		State_name="Karnataka";
		Population=(long)6.446 ;
		area ="191,791 km²";
		Country_Name="India";
		System.out.println("***State Details***");
		System.out.println(State_name +" "+ 
				Population +" "+ 
				area +" "+ 
				Country_Name );
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}


}
class District{
	String District_name;
	long population;
	String area;
	String State_Name;
	District(){
		District_name="Mandya";
		population=(long)3.5 ;
		area ="20.4 km²";
		State_Name="Karnataka";
		System.out.println("***District Details***");
		System.out.println(District_name + " "+
				population + " "+
				area + " "+
				State_Name
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 
	}


}

class Village{
	String Village_name;
	long population;
	String area;
	String District_Name;
	Village(){
		Village_name="Kestur";
		population=3000 ;
		area ="3.5 km²";
		District_Name="Mandya";
		System.out.println("****Vilage Details****");
		System.out.println(Village_name + " "+
				population + " "+
				area + " "+
				District_Name
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"); 

	}
}

public class Constructorassignment3 {

	public static void main(String[] args) {

		Country c1 = new Country();


		State s1=new State();


		District d1=new District();


		Village v1=new Village();

	}

}